package com.czx.saturn.common.exeception;

import com.czx.saturn.common.constants.ErrorCode;

public class SaturnExeception extends RuntimeException {
    private ErrorCode errorCode;
    private Throwable cause;

    public SaturnExeception(ErrorCode error,Throwable cause) {
        //打印错误信息
//        String msg = "[" + error.getCode() + ":" + error.getMsg() + "]";
//        super(msg);
        this.errorCode = error;
        this.cause = cause;
    }


}
