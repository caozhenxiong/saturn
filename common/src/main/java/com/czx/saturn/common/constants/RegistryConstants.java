package com.czx.saturn.common.constants;

/**
 * 注册中心常量
 * @author caozhenxiong
 */
public class RegistryConstants {
    public static final String ROOT_NODE = "saturn";
    public static final String PERCENT_S = "%s";
    public static final String PATH_SEPERATOR = "/";
    /**
     * saturn / module / env / config-client / iplist
     */
    public static String CLIENT_NODE = ROOT_NODE + PATH_SEPERATOR + PERCENT_S + PATH_SEPERATOR + PERCENT_S + PATH_SEPERATOR + "config-client" + PATH_SEPERATOR + PERCENT_S;
    /**
     * saturn / env / config-server / iplist
     */
    public static String SERVER_NODE = ROOT_NODE + PATH_SEPERATOR + PERCENT_S +  PATH_SEPERATOR + "config-server" + PATH_SEPERATOR + PERCENT_S;
    public static String CONFIG_CHANGE_NODE = ROOT_NODE + PATH_SEPERATOR + PERCENT_S + PATH_SEPERATOR + PERCENT_S + PATH_SEPERATOR + "config-client" + PATH_SEPERATOR + PERCENT_S;



}
