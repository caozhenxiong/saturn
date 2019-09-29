package com.czx.saturn.core.strategy.registor;

import com.czx.saturn.common.bean.ZKNode;
import com.czx.saturn.common.constants.ProfileType;
import com.czx.saturn.common.registry.AbstractConfigRegistor;
import com.czx.saturn.core.anotation.ProfileMatch;

import java.util.List;

@ProfileMatch(ProfileType.PROPERTIES)
public class PropertiesRegistor extends AbstractConfigRegistor {

    public List<ZKNode> prepareData() {
        return null;
    }

    public void end() {

    }

    public void regist(List<ZKNode> nodes) {

    }
}
