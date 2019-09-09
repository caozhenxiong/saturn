package com.czx.saturn.common.registry;

import com.czx.saturn.common.bean.ZKNode;
import org.apache.curator.framework.CuratorFramework;

public class RegistryUtils {
    public static String createNode(CuratorFramework curatorFramework,ZKNode zkNode) throws Exception {
        return curatorFramework.create().creatingParentsIfNeeded().withMode(zkNode.getNodeMode()).forPath(zkNode.getPath(),zkNode.getData());
    }
}
