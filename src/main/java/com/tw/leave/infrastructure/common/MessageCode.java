package com.tw.leave.infrastructure.common;

public enum MessageCode implements BaseMessageCode {

    ;

    private final int code;
    private final String message;

    MessageCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
