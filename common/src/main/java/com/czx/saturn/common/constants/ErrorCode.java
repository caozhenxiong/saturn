package com.czx.saturn.common.constants;

/**
 * @author caozhenxiong
 */

public enum ErrorCode {
    //系统异常
    SYSTEM_ERROR("9999","系统异常"),
    //客户端注册异常
    CLIENT_REG_ERROR("c1001","客户端regist异常"),
    SERVER_REG_ERROR("s1001","服务端regist异常");
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误描述
     */
    private String msg;

    ErrorCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
