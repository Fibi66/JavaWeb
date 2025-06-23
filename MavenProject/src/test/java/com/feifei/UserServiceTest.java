package com.feifei;

import org.junit.jupiter.api.Test;

/**
 * 测试类
 */
public class UserServiceTest {
    @Test
    public void testGetAge(){
        UserService userService = new UserService();
        int age = userService.getAge("400008200001261888");
        System.out.println(age);

    }
}
