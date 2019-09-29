package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ConfigProperties;
import com.czx.saturn.core.entity.ConfigPropertiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigPropertiesMapper {
    int countByExample(ConfigPropertiesExample example);

    int deleteByExample(ConfigPropertiesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigProperties record);

    int insertSelective(ConfigProperties record);

    List<ConfigProperties> selectByExample(ConfigPropertiesExample example);

    ConfigProperties selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigProperties record, @Param("example") ConfigPropertiesExample example);

    int updateByExample(@Param("record") ConfigProperties record, @Param("example") ConfigPropertiesExample example);

    int updateByPrimaryKeySelective(ConfigProperties record);

    int updateByPrimaryKey(ConfigProperties record);
}