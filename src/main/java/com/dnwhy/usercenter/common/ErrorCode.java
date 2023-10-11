package com.dnwhy.usercenter.common;

import lombok.Getter;

/**
 * @author dnwhy
 * @date 2023/9/20 22:31
 * @title ErrorCode
 * @package com.dnwhy.usercenter.common
 * @description 错误码
 */
@Getter
public enum ErrorCode {

    PARAMS_ERROR(40000, "请求参数错误", ""),
    PARAMS_NULL_ERROR(40001, "请求为空", ""),
    NOT_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", ""),
    SYSTEM_ERROR(50000, "系统内部异常", ""),
    USER_DUPLICATION_ERROR(55555, "用户重复", "");

    private final int code;
    private final String message;
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

}
