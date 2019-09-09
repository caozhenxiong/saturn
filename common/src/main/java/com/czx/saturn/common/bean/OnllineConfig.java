package com.czx.saturn.common.bean;

import com.czx.saturn.common.constants.ProfileType;

public class OnllineConfig {
    /**
     * 配置文件名称
     */
    private String profileName;
    /**
     * 环境
     */
    private String envId;
    /**
     * 系统
     */
    private String projectId;

    /**
     * 配置文件类型 JSON and Key-Value
     */
    private ProfileType profileType;

    /**
     * 配置内容
     */
    private byte[] content;

    public ProfileType getProfileType() {
        return profileType;
    }

    public void setProfileType(ProfileType profileType) {
        this.profileType = profileType;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
}
