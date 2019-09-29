package com.czx.saturn.common.registry;

import javax.annotation.PostConstruct;

public abstract class AbstractRegistor {

    public abstract void prepareData();

    public abstract void regist();

    public abstract void end();

    @PostConstruct
    public void process(){
        prepareData();
        regist();
        end();
    }

}
