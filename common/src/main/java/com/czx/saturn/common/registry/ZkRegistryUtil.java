package com.czx.saturn.common.registry;

import com.czx.saturn.common.bean.ZKNode;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.BoundedExponentialBackoffRetry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 注册中心,后期可抽成扩展
 * @author caozhenxiong
 */
@Component
public class ZkRegistryUtil {
    private static final Logger logger = LoggerFactory.getLogger(ZkRegistryUtil.class);
    /**
     * todo ip待抽成配置
     */
    private CuratorFramework curatorFramework = CuratorFrameworkFactory.
            newClient("czx.saturn.com:2182", new BoundedExponentialBackoffRetry(1000, 1000, 3));

    /**
     * 创建节点
     */
    public  String createNode(ZKNode zkNode) throws Exception {
        return curatorFramework.create().creatingParentsIfNeeded().withMode(zkNode.getNodeMode()).forPath(zkNode.getPath(), zkNode.getData());
    }
}
