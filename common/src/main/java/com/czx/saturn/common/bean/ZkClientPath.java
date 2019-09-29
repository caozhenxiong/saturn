package com.czx.saturn.common.bean;

import com.czx.saturn.common.constants.RegistryConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZkClientPath {
    private String root = RegistryConstants.ROOT_NODE;
    private String client = RegistryConstants.CLIENT_NODE;
    private String app;
    private String env;
    private String namespace;
    private String ip;


    public String path(){
        return root + RegistryConstants.PATH_SEPERATOR + client + RegistryConstants.PATH_SEPERATOR + app
                + RegistryConstants.PATH_SEPERATOR + env + RegistryConstants.PATH_SEPERATOR + namespace
                + RegistryConstants.PATH_SEPERATOR + ip;
    }
}
