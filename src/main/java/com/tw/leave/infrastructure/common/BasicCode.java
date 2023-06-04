package com.tw.leave.infrastructure.common;

public enum BasicCode {

    OK("200", "成功"),
    FAIL("500", "服务端错误"),
    ;

    public String code;

    public String desc;

    private BasicCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
