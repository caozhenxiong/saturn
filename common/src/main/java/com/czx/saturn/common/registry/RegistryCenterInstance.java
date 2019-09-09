package com.czx.saturn.common.registry;

import com.czx.saturn.common.bean.po.ConfigPo;
import com.czx.saturn.common.constants.ErrorCode;
import com.czx.saturn.common.constants.RegistryConstants;
import com.czx.saturn.common.exeception.SaturnExeception;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.BoundedExponentialBackoffRetry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 注册中心,后期可抽成扩展
 */
@Service
public class RegistryCenterInstance {
    private static final Logger logger = LoggerFactory.getLogger(RegistryCenterInstance.class);

    /**
     * ip待抽成配置
     */
    private CuratorFramework curatorFramework = CuratorFrameworkFactory.
            newClient("127.0.0.1:2182", new BoundedExponentialBackoffRetry(1000, 1000, 3));

    /**
     * 创建客户端在zk的节点
     *
     * @param host 客户端ip地址
     */
    public void createClientAvaliablePath(String projectId, String envId, String host) {
        try {
            String pathReturn = RegistryUtils.createNode(curatorFramework, RegistryConstants.buildClientAvaliablePath(projectId, envId, host));
            logger.info("已创建客户端path:{}", pathReturn);
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.CLIENT_REG_ERROR, e);
        }
    }

    /**
     * 创建服务端节点
     *
     * @param env  环境
     * @param host 客户端ip地址
     */
    public void createServerPath(String projectId, String env, String host) {
        try {
            String forPath = RegistryUtils.createNode(curatorFramework, RegistryConstants.buildServeAvaliablePath(projectId, env, host));
            logger.info("已创建服务端path:{}", forPath);
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.SERVER_REG_ERROR, e);
        }
    }

    /**
     * 创建配置变更监听节点
     */
    public void createConfigChangePath(List<ConfigPo> configs) {
        try {
            for (ConfigPo configPo : configs) {
                String forPath = RegistryUtils.createNode(curatorFramework, RegistryConstants.buildChangeListenerPath(configPo.getProjectId(),
                        configPo.getEnvId(), configPo.getProfileId(), configPo.getVersion()));
                logger.info("已创建服务端path:{}", forPath);
            }
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.SERVER_REG_ERROR, e);
        }
    }

}
