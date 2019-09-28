package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.NamespaceInfo;
import com.czx.saturn.core.entity.NamespaceInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NamespaceInfoMapper {
    int countByExample(NamespaceInfoExample example);

    int deleteByExample(NamespaceInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NamespaceInfo record);

    int insertSelective(NamespaceInfo record);

    List<NamespaceInfo> selectByExample(NamespaceInfoExample example);

    NamespaceInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NamespaceInfo record, @Param("example") NamespaceInfoExample example);

    int updateByExample(@Param("record") NamespaceInfo record, @Param("example") NamespaceInfoExample example);

    int updateByPrimaryKeySelective(NamespaceInfo record);

    int updateByPrimaryKey(NamespaceInfo record);
}