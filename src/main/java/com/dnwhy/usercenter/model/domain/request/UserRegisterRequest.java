package com.dnwhy.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: dnwhy.
 * @date: 2023/9/10 19:55
 * @description: 用户注册请求题
 * @title: UserRegisterRequest
 * @package: com.dnwhy.usercenter.model.domain.request
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String roomNum;
}
