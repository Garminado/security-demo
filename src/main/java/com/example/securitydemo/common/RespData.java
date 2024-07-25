package com.example.securitydemo.common;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liujiaming
 * @since 2024-07-25
 */
@NoArgsConstructor
@Data
public class RespData<T> {

    private int code;

    private String msg;

    private T data;

    public RespData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> RespData<T> success() {
        return new RespData<>(200, "success");
    }

    public static <T> RespData<T> fail() {
        return new RespData<>(500, "fail");
    }

    public static <T> RespData<T> success(T data) {
        RespData<T> resp = success();
        resp.data = data;
        return resp;
    }
}
