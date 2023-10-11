package com.dnwhy.usercenter.service;

import com.dnwhy.usercenter.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author: dnwhy.
 * @date: 2023/9/9 21:05
 * @description: 用户服务测试
 * @title: UserServiceTest
 * @package: com.dnwhy.usercenter.service
 */
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testAddUser() {

        User user = new User();

        user.setUsername("dnwhy");
        user.setUserAccount("123");
        user.setAvatarUrl("https://himg.bdimg.com/sys/portrait/item/public.1.93a0dce6.EeJZTlzojhIXNsg81JIYMw.jpg");
        user.setGender(0);
        user.setUserPassword("xxx");
        user.setPhone("123");
        user.setEmail("456");

        boolean result = userService.save(user);
        Assertions.assertTrue(result);

    }

    @Test
    void userRegister() {
        String userAccount = "duanwenhui";
        String userPassword = "duanwenhui123456";
        String checkPassword = "duanwenhui123456";
        String roomNum = "51562";
        long result = userService.userRegister(userAccount, userPassword, checkPassword, roomNum);
        Assertions.assertTrue(result > 0);

    }
}