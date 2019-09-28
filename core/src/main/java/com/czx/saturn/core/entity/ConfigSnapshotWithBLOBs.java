package com.czx.saturn.core.entity;

public class ConfigSnapshotWithBLOBs extends ConfigSnapshot {
    private String configOldText;

    private String configNewText;

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