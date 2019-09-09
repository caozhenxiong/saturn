package com.czx.saturn.common.registry;

import com.czx.saturn.common.bean.ZKNode;
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

import javax.annotation.Resource;
import java.util.List;

/**
 * 注册中心,后期可抽成扩展
 * @author caozhenxiong
 */
@Service
public class ZkRegistryCenter {
    private static final Logger logger = LoggerFactory.getLogger(ZkRegistryCenter.class);

    @Resource
    private RegistryUtils registryUtils;

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
            String pathReturn = this.createNode(curatorFramework, RegistryConstants.buildClientAvaliablePath(projectId, envId, host));
            logger.info("已创建客户端消费者节点path:{}", pathReturn);
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
            String forPath = this.createNode(curatorFramework, RegistryConstants.buildServeAvaliablePath(projectId, env, host));
            logger.info("已创建服务端生产者节点path:{}", forPath);
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
                String forPath = this.createNode(curatorFramework, RegistryConstants.buildChangeListenerPath(configPo.getProjectId(),
                        configPo.getEnvId(), configPo.getProfileId(), configPo.getVersion()));
                logger.info("已创建配置变更监听节点path:{}", forPath);
            }
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.SERVER_REG_ERROR, e);
        }
    }

    /**
     * 创建节点
     */
    private String createNode(CuratorFramework curatorFramework, ZKNode zkNode) throws Exception {
        return curatorFramework.create().creatingParentsIfNeeded().withMode(zkNode.getNodeMode()).forPath(zkNode.getPath(), zkNode.getData());
    }
}
