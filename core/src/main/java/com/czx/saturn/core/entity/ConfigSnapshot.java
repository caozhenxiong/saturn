package com.czx.saturn.core.entity;

import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNamespaceCode() {
        return namespaceCode;
    }

    public void setNamespaceCode(String namespaceCode) {
        this.namespaceCode = namespaceCode == null ? null : namespaceCode.trim();
    }

    public String getEnvCode() {
        return envCode;
    }

    public void setEnvCode(String envCode) {
        this.envCode = envCode == null ? null : envCode.trim();
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey == null ? null : configKey.trim();
    }

    public String getConfigOldValue() {
        return configOldValue;
    }

    public void setConfigOldValue(String configOldValue) {
        this.configOldValue = configOldValue == null ? null : configOldValue.trim();
    }

    public String getConfigNewValue() {
        return configNewValue;
    }

    public void setConfigNewValue(String configNewValue) {
        this.configNewValue = configNewValue == null ? null : configNewValue.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Integer getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getConfigOldText() {
        return configOldText;
    }

    public void setConfigOldText(String configOldText) {
        this.configOldText = configOldText == null ? null : configOldText.trim();
    }

    public String getConfigNewText() {
        return configNewText;
    }

    public void setConfigNewText(String configNewText) {
        this.configNewText = configNewText == null ? null : configNewText.trim();
    }
}