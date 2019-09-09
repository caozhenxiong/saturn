package com.czx.saturn.common.registry;

import com.czx.saturn.common.constants.ErrorCode;
import com.czx.saturn.common.constants.RegistryConstants;
import com.czx.saturn.common.exeception.SaturnExeception;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.BoundedExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistryCenterInstance {
    private static final Logger logger = LoggerFactory.getLogger(RegistryCenterInstance.class);

    private CuratorFramework curatorFramework = CuratorFrameworkFactory.
            newClient("127.0.0.1:2182", new BoundedExponentialBackoffRetry(1000, 1000, 3));

    /**
     * 创建客户端在zk的节点
     *
     * @param host 客户端ip地址
     */
    public void createClientPath(String moduleName, String env, String host) {
        String path = String.format(RegistryConstants.CLIENT_NODE, moduleName, env, host);
        try {
            String pathReturn = curatorFramework.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath(path);
            logger.info("已创建客户端path:{}", pathReturn);
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.CLIENT_REG_ERROR, e);
        }
    }

    /**
     * 创建服务端节点
     * @param env 环境
     * @param host 客户端ip地址
     */
    public void createServerPath(String env, String host) {
        String path = String.format(RegistryConstants.SERVER_NODE, env, host);
        try {
            String forPath = curatorFramework.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath(path);
            logger.info("已创建服务端path:{}", forPath);
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.SERVER_REG_ERROR, e);
        }
    }

    /**
     * 创建配置变更监听节点
     * @param moduleName 系统名称
     * @param env 环境
     * @param configNames 需要改成配置文件信息，要传入version+上次修改时间戳
     */
    public void createConfigChangePath(String moduleName, String env, List<String> configNames) {
        try {
            for (String configName : configNames) {
                String path = String.format(RegistryConstants.CONFIG_CHANGE_NODE, moduleName, env, configName);
                String forPath = curatorFramework.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath(path);
                logger.info("已创建服务端path:{}", forPath);
            }
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.SERVER_REG_ERROR, e);
        }
    }

}
