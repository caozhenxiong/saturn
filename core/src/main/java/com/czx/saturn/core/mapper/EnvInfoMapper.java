package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.EnvInfo;
import com.czx.saturn.core.entity.EnvInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EnvInfoMapper {
    int countByExample(EnvInfoExample example);

    int deleteByExample(EnvInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EnvInfo record);

    int insertSelective(EnvInfo record);

    List<EnvInfo> selectByExample(EnvInfoExample example);

    EnvInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EnvInfo record, @Param("example") EnvInfoExample example);

    int updateByExample(@Param("record") EnvInfo record, @Param("example") EnvInfoExample example);

    int updateByPrimaryKeySelective(EnvInfo record);

    int updateByPrimaryKey(EnvInfo record);
}