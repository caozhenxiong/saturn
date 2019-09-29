package com.czx.saturn.common.constants;

/**
 * 配置文件类型
 * @author caozhenxiong
 */
public enum ProfileType {
    /** json and kv **/
    TEXT("TEXT","TEXT"),
    PROPERTIES("PROPERTIES","PROPERTIES");

    String name;
    String desc;

    ProfileType(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

}
