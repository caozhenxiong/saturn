package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ConfigPropertiesSnapshot;
import com.czx.saturn.core.entity.ConfigPropertiesSnapshotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigPropertiesSnapshotMapper {
    int countByExample(ConfigPropertiesSnapshotExample example);

    int deleteByExample(ConfigPropertiesSnapshotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigPropertiesSnapshot record);

    int insertSelective(ConfigPropertiesSnapshot record);

    List<ConfigPropertiesSnapshot> selectByExample(ConfigPropertiesSnapshotExample example);

    ConfigPropertiesSnapshot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigPropertiesSnapshot record, @Param("example") ConfigPropertiesSnapshotExample example);

    int updateByExample(@Param("record") ConfigPropertiesSnapshot record, @Param("example") ConfigPropertiesSnapshotExample example);

    int updateByPrimaryKeySelective(ConfigPropertiesSnapshot record);

    int updateByPrimaryKey(ConfigPropertiesSnapshot record);
}