package com.czx.saturn.core.server.avaliable;

import com.czx.saturn.common.registry.ZkRegistryUtil;
import com.czx.saturn.common.util.IpUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author caozhenxiong
 */
@Service
public class ServerRegisterCenter {

    @Resource
    private ZkRegistryUtil zkRegistryUtil;

    @Resource
    private IpUtils ipUtils;


    public void registerServer(){
        //先查询支持的项目以及环境信息 projectId envId
    }


}
