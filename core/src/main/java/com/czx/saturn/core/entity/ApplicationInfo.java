package com.czx.saturn.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationInfo {
    private Long id;

    private String code;

    private String name;

    private String developers;

    private String admins;

    private String desc;

    private String lastOperator;

    private Date createTime;

    private Date updateTime;

    private String ext;

}