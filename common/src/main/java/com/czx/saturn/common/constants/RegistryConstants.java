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
    public static final String CONFIG_NODE = "config";
    public static final String SERVER_NODE = "server";
    public static final String CLIENT_NODE = "client";

    public static final String PERCENT_S = "%s";
    public static final String PATH_SEPERATOR = "/";
    public static final String SPP = PATH_SEPERATOR + PERCENT_S;


}
