package com.czx.saturn.core.service.regist;

import com.czx.saturn.common.registry.AbstractRegistor;
import com.czx.saturn.common.registry.ZkRegistryUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ServerRegistor extends AbstractRegistor {
    @Resource
    private ZkRegistryUtil zkRegistryUtil;


    public void prepareData() {

    }

    public void regist() {

    }

    public void end() {

    }
}
