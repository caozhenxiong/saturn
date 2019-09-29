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
public class ZkServerPath {
    private String root = RegistryConstants.ROOT_NODE;
    private String server = RegistryConstants.SERVER_NODE;
    private String ip;

    public String path(){
        return root + RegistryConstants.PATH_SEPERATOR + server + RegistryConstants.PATH_SEPERATOR + ip;
    }
}
