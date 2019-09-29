package com.czx.saturn.common.registry;

import com.czx.saturn.common.bean.ZKNode;

import java.util.List;

public abstract class AbstractConfigRegistor extends AbstractRegistor {

    public abstract List<ZKNode> prepareData();

    public abstract void end();

    public void process(){
        regist(prepareData());
        end();
    }

}
