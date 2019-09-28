package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ConfigInfo;
import com.czx.saturn.core.entity.ConfigInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigInfoMapper {
    int countByExample(ConfigInfoExample example);

    int deleteByExample(ConfigInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigInfo record);

    int insertSelective(ConfigInfo record);

    List<ConfigInfo> selectByExampleWithBLOBs(ConfigInfoExample example);

    List<ConfigInfo> selectByExample(ConfigInfoExample example);

    ConfigInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigInfo record, @Param("example") ConfigInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigInfo record, @Param("example") ConfigInfoExample example);

    int updateByExample(@Param("record") ConfigInfo record, @Param("example") ConfigInfoExample example);

    int updateByPrimaryKeySelective(ConfigInfo record);

    int updateByPrimaryKeyWithBLOBs(ConfigInfo record);

    int updateByPrimaryKey(ConfigInfo record);
}