package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ConfigText;
import com.czx.saturn.core.entity.ConfigTextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigTextMapper {
    int countByExample(ConfigTextExample example);

    int deleteByExample(ConfigTextExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigText record);

    int insertSelective(ConfigText record);

    List<ConfigText> selectByExampleWithBLOBs(ConfigTextExample example);

    List<ConfigText> selectByExample(ConfigTextExample example);

    ConfigText selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigText record, @Param("example") ConfigTextExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigText record, @Param("example") ConfigTextExample example);

    int updateByExample(@Param("record") ConfigText record, @Param("example") ConfigTextExample example);

    int updateByPrimaryKeySelective(ConfigText record);

    int updateByPrimaryKeyWithBLOBs(ConfigText record);

    int updateByPrimaryKey(ConfigText record);
}