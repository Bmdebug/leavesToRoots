package com.top.sports.data.center.domain;

import com.top.sports.data.center.constant.ErrorCode;

import java.text.MessageFormat;

/**
 * @author zyg
 */
public class BusinessException extends RuntimeException {

    private String code;
    private Object[] args;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.message());
        this.code = errorCode.code();
    }

    public BusinessException(String code, String message, Object... args) {
        super(MessageFormat.format(message, args));
        this.code = code;
        this.args = args;
    }

    public String getCode() {
        return this.code;
    }

    public Object[] getArgs() {
        return args;
    }
}
