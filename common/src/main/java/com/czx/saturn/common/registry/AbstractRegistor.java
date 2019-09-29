package com.czx.saturn.common.registry;

import com.czx.saturn.common.bean.ZKNode;

import java.util.List;

public abstract class AbstractRegistor {

    public abstract void regist(List<ZKNode> nodes);

}
