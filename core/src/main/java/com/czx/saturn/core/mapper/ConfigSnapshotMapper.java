package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ConfigSnapshot;
import com.czx.saturn.core.entity.ConfigSnapshotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigSnapshotMapper {
    int countByExample(ConfigSnapshotExample example);

    int deleteByExample(ConfigSnapshotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigSnapshot record);

    int insertSelective(ConfigSnapshot record);

    List<ConfigSnapshot> selectByExampleWithBLOBs(ConfigSnapshotExample example);

    List<ConfigSnapshot> selectByExample(ConfigSnapshotExample example);

    ConfigSnapshot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigSnapshot record, @Param("example") ConfigSnapshotExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigSnapshot record, @Param("example") ConfigSnapshotExample example);

    int updateByExample(@Param("record") ConfigSnapshot record, @Param("example") ConfigSnapshotExample example);

    int updateByPrimaryKeySelective(ConfigSnapshot record);

    int updateByPrimaryKeyWithBLOBs(ConfigSnapshot record);

    int updateByPrimaryKey(ConfigSnapshot record);
}