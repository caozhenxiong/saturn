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
public class ConfigProperties {
    private Long id;

    private String type;

    private String namespaceCode;

    private String envCode;

    private String appCode;

    private String configKey;

    private String configValue;

    private String lastOperator;

    private Integer version;

    private Date createTime;

    private Date updateTime;

}