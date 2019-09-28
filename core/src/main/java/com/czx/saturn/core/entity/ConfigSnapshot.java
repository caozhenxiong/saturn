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
public class ConfigSnapshot {
    private Long id;

    private Long configId;

    private String type;

    private String namespaceCode;

    private String envCode;

    private String appCode;

    private String configKey;

    private String configOldValue;

    private String configNewValue;

    private String operator;

    private Integer currentVersion;

    private Date createTime;

    private Date updateTime;

    private String configOldText;

    private String configNewText;
}