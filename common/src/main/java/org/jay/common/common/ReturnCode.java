package org.jay.common.common;

public enum ReturnCode {
    SUCCESS(200, "一切正常"),
    FORBIDDEN(300, "权限有问题，被禁止"),
    REQUEST_ERROR(400, "请求的有问题"),
    INTERNAL_ERROR(500, "内部错误");
    private int code;
    private String message;
    ReturnCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
