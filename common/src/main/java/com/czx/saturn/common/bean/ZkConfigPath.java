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
public class ZkConfigPath {
    private String root = RegistryConstants.ROOT_NODE;
    private String config = RegistryConstants.CONFIG_NODE;
    private String app;
    private String env;
    private String namespace;
    private String data;

    public String path(){
        return root + RegistryConstants.PATH_SEPERATOR + config + RegistryConstants.PATH_SEPERATOR + app
                + RegistryConstants.PATH_SEPERATOR + env + RegistryConstants.PATH_SEPERATOR + namespace
                + RegistryConstants.PATH_SEPERATOR + data;
    }
}
