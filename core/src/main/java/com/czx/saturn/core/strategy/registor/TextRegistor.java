package com.czx.saturn.core.strategy.registor;


import com.czx.saturn.common.bean.ZKNode;
import com.czx.saturn.common.constants.ProfileType;
import com.czx.saturn.common.registry.AbstractConfigRegistor;
import com.czx.saturn.core.anotation.ProfileMatch;
import com.czx.saturn.core.entity.ConfigText;
import com.czx.saturn.core.entity.ConfigTextExample;
import com.czx.saturn.core.mapper.ConfigTextMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ProfileMatch(ProfileType.TEXT)
public class TextRegistor extends AbstractConfigRegistor {

    @Resource
    private ConfigTextMapper configTextMapper;


    //todo todo
    public List<ZKNode> prepareData() {
        List<ConfigText> configTextList = configTextMapper.selectByExample(new ConfigTextExample());
        configTextList.stream().map(ConfigText::getAppCode).collect(Collectors.toList());
    }

    public void regist(List<ZKNode> data) {

    }

    public void end() {

    }
}
