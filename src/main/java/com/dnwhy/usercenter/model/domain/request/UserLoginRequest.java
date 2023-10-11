package com.dnwhy.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: dnwhy.
 * @date: 2023/9/10 20:10
 * @description:
 * @title: UserLoginRequest
 * @package: com.dnwhy.usercenter.model.domain.request
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userAccount;

    private String userPassword;

}
