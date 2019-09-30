package com.czx.saturn.core.entity;

import com.czx.saturn.common.bean.ZkConfigPath;
import com.czx.saturn.common.constants.ProfileType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author caozhenxiong
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NamespaceInfo {
    private Long id;

    private String code;

    private String name;

    private String appCode;

    private String envCode;

    private String desc;

    private String ext;

    private String lastOperator;

    private ProfileType type;

    private Integer version;

    private Date createTime;

    private Date updateTime;

    public ZkConfigPath toPath(){
        return ZkConfigPath.builder().app(appCode).env(envCode).namespace(code).version(version).build();
    }

}