package com.czx.saturn.core.strategy.registor;


import com.czx.saturn.common.bean.ZKNode;
import com.czx.saturn.common.bean.ZkConfigPath;
import com.czx.saturn.common.constants.ErrorCode;
import com.czx.saturn.common.constants.ProfileType;
import com.czx.saturn.common.exeception.SaturnExeception;
import com.czx.saturn.common.registry.AbstractConfigRegistor;
import com.czx.saturn.common.registry.ZkRegistryUtil;
import com.czx.saturn.core.anotation.ProfileMatch;
import com.czx.saturn.core.entity.NamespaceInfo;
import com.czx.saturn.core.entity.NamespaceInfoExample;
import com.czx.saturn.core.mapper.NamespaceInfoMapper;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author caozhenxiong
 */
@ProfileMatch(ProfileType.TEXT)
public class TextRegistor extends AbstractConfigRegistor {

    @Resource
    private NamespaceInfoMapper namespaceInfoMapper;

    @Resource
    private ZkRegistryUtil zkRegistryUtil;


    @Override
    public List<ZKNode> prepareData() {
        NamespaceInfoExample namespaceInfoExample = new NamespaceInfoExample();
        namespaceInfoExample.createCriteria().andTypeEqualTo(ProfileType.TEXT.toString());
        List<NamespaceInfo> namespaceInfos = namespaceInfoMapper.selectByExample(namespaceInfoExample);
        List<ZKNode> zkNodes = namespaceInfos.stream().map(NamespaceInfo::toPath)
                .map(ZkConfigPath::toZkNode).collect(Collectors.toList());
        return zkNodes;
    }

    @Override
    public void regist(List<ZKNode> data) {
        try {
            for (ZKNode zkNode : data) {
                zkRegistryUtil.createNode(zkNode);
            }
        } catch (Exception e) {
            throw new SaturnExeception(ErrorCode.SYSTEM_ERROR, e);
        }
    }

    @Override
    public void end() {

    }
}
