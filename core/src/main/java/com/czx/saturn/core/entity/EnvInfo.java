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
public class EnvInfo {
    private Long id;

    private String code;

    private String name;

    private String appCode;

    private String desc;

    private String ext;

    private String lastOperator;

    private Date createTime;

    private Date updateTime;


}