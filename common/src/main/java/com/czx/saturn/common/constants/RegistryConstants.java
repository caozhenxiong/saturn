package com.czx.saturn.common.constants;

import com.czx.saturn.common.bean.ZKNode;
import org.apache.zookeeper.CreateMode;

import java.io.UnsupportedEncodingException;

/**
 * 注册中心常量
 *
 * @author caozhenxiong
 */
public class RegistryConstants {
    public static final String ROOT_NODE = "saturn";
    /**
     * 可用性
     */
    public static final String AVALIABLE = "avaliable";
    /**
     * 数据变更
     */
    public static final String NODE_MODIFY = "change";
    public static final String PERCENT_S = "%s";
    public static final String PATH_SEPERATOR = "/";
    public static final String SPP = PATH_SEPERATOR + PERCENT_S;
    public static final String SERVER_NODE = "server";
    public static final String CLIENT_NODE = "client";
    public static final String FORMAT_SERVER_AVALIABLE_PATH = ROOT_NODE +
            PATH_SEPERATOR + AVALIABLE + PATH_SEPERATOR + SERVER_NODE + SPP + SPP + SPP;
    public static final String FORMAT_CLIENT_AVALIABLE_PATH = ROOT_NODE +
            PATH_SEPERATOR + AVALIABLE + PATH_SEPERATOR + CLIENT_NODE + SPP + SPP + SPP;

    public static final String FORMAT_CONFIG_CHANGE_PATH = ROOT_NODE +
            PATH_SEPERATOR + NODE_MODIFY + SPP + SPP + SPP;

    /**
     * server端zk路径
     * saturn/avaliable/server/${projectId}/${evnId}/host_${ip}
     *
     * @return path
     */
    public static ZKNode buildServeAvaliablePath(String projectId, String envId, String ip) {
        return ZKNode.buider().withPath(String.format(FORMAT_SERVER_AVALIABLE_PATH, projectId, envId, "host_" + ip))
                .withNodeMode(CreateMode.EPHEMERAL);
    }

    /**
     * client端zk路径
     * saturn/avaliable/client/${projectId}/${evnId}/host_${ip}
     *
     * @return path
     */
    public static ZKNode buildClientAvaliablePath(String projectId, String envId, String ip) {
        return ZKNode.buider().withPath(String.format(FORMAT_CLIENT_AVALIABLE_PATH, projectId, envId, ip))
                .withNodeMode(CreateMode.EPHEMERAL);
    }

    /**
     * 监听配置文件变更节点路径
     * saturn/change/${project}/${env}/${profileId}
     *
     * @return path
     */
    public static ZKNode buildChangeListenerPath(String projectId, String envId, String profileId,long version) throws UnsupportedEncodingException {
        return ZKNode.buider().withPath(String.format(FORMAT_CONFIG_CHANGE_PATH, projectId, envId, profileId))
                .withNodeMode(CreateMode.EPHEMERAL).withData((version + "_" + System.currentTimeMillis()).getBytes("UTF-8"));
    }


}
