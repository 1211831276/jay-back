package org.jay.common.common;

public class CommonResult<T> {
    private int code;
    private T data;

    CommonResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult(200, data);
    }
    public static CommonResult error(ReturnCodeEnum code) {
        return new CommonResult(code.getCode(), code.getMessage());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
