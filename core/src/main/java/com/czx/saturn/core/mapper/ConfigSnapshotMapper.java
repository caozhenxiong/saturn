package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ConfigSnapshot;
import com.czx.saturn.core.entity.ConfigSnapshotExample;
import com.czx.saturn.core.entity.ConfigSnapshotWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigSnapshotMapper {
    int countByExample(ConfigSnapshotExample example);

    int deleteByExample(ConfigSnapshotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigSnapshotWithBLOBs record);

    int insertSelective(ConfigSnapshotWithBLOBs record);

    List<ConfigSnapshotWithBLOBs> selectByExampleWithBLOBs(ConfigSnapshotExample example);

    List<ConfigSnapshot> selectByExample(ConfigSnapshotExample example);

    ConfigSnapshotWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigSnapshotWithBLOBs record, @Param("example") ConfigSnapshotExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigSnapshotWithBLOBs record, @Param("example") ConfigSnapshotExample example);

    int updateByExample(@Param("record") ConfigSnapshot record, @Param("example") ConfigSnapshotExample example);

    int updateByPrimaryKeySelective(ConfigSnapshotWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ConfigSnapshotWithBLOBs record);

    int updateByPrimaryKey(ConfigSnapshot record);
}