package com.dnwhy.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dnwhy.usercenter.model.domain.User;
import javax.servlet.http.HttpServletRequest;

/**
 * @author asus
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-09-09 20:59:21
 */
public interface UserService extends IService<User> {


    /**
     * 用户注释
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param roomNum 房间号
     * @return long 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String roomNum);

    /**
     * 用户登录
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户安全
     * @param user 原用户
     * @return 安全的信息
     */
    User getSafetyUser(User user);

    Integer userLogout(HttpServletRequest request);
}
