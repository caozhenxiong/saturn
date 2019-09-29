package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ConfigTextSnapshot;
import com.czx.saturn.core.entity.ConfigTextSnapshotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfigTextSnapshotMapper {
    int countByExample(ConfigTextSnapshotExample example);

    int deleteByExample(ConfigTextSnapshotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigTextSnapshot record);

    int insertSelective(ConfigTextSnapshot record);

    List<ConfigTextSnapshot> selectByExampleWithBLOBs(ConfigTextSnapshotExample example);

    List<ConfigTextSnapshot> selectByExample(ConfigTextSnapshotExample example);

    ConfigTextSnapshot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigTextSnapshot record, @Param("example") ConfigTextSnapshotExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfigTextSnapshot record, @Param("example") ConfigTextSnapshotExample example);

    int updateByExample(@Param("record") ConfigTextSnapshot record, @Param("example") ConfigTextSnapshotExample example);

    int updateByPrimaryKeySelective(ConfigTextSnapshot record);

    int updateByPrimaryKeyWithBLOBs(ConfigTextSnapshot record);

    int updateByPrimaryKey(ConfigTextSnapshot record);
}