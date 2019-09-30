package com.czx.saturn.common.bean;

import com.czx.saturn.common.constants.ErrorCode;
import com.czx.saturn.common.constants.RegistryConstants;
import com.czx.saturn.common.exeception.SaturnExeception;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.zookeeper.CreateMode;

import java.io.UnsupportedEncodingException;

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
    private String version;

    public String path(){
        return root + RegistryConstants.PATH_SEPERATOR + config + RegistryConstants.PATH_SEPERATOR + app
                + RegistryConstants.PATH_SEPERATOR + env + RegistryConstants.PATH_SEPERATOR + namespace;
    }

    public ZKNode toZkNode(){
        try {
            return ZKNode.buider().withNodeMode(CreateMode.EPHEMERAL).withPath(path()).withData(version.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new SaturnExeception(ErrorCode.SYSTEM_ERROR, e);
        }
    }

}
