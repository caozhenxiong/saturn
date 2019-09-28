package com.czx.saturn.core.mapper;

import com.czx.saturn.core.entity.ApplicationInfo;
import com.czx.saturn.core.entity.ApplicationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApplicationInfoMapper {
    int countByExample(ApplicationInfoExample example);

    int deleteByExample(ApplicationInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApplicationInfo record);

    int insertSelective(ApplicationInfo record);

    List<ApplicationInfo> selectByExampleWithBLOBs(ApplicationInfoExample example);

    List<ApplicationInfo> selectByExample(ApplicationInfoExample example);

    ApplicationInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApplicationInfo record, @Param("example") ApplicationInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ApplicationInfo record, @Param("example") ApplicationInfoExample example);

    int updateByExample(@Param("record") ApplicationInfo record, @Param("example") ApplicationInfoExample example);

    int updateByPrimaryKeySelective(ApplicationInfo record);

    int updateByPrimaryKeyWithBLOBs(ApplicationInfo record);

    int updateByPrimaryKey(ApplicationInfo record);
}