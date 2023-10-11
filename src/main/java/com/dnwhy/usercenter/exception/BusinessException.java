package com.dnwhy.usercenter.exception;

import com.dnwhy.usercenter.common.ErrorCode;
import lombok.Getter;

/**
 * @author dnwhy
 * @date 2023/9/20 22:54
 * @title BusinessException
 * @package com.dnwhy.usercenter.exception
 * @description 定义业务异常类
 */
@Getter
public class BusinessException extends RuntimeException {

    /**
     * 异常码
     */
    private final int code;

    /**
     * 描述
     */
    private final String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

}
