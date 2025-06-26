package com.feifei.controller;

import cn.hutool.core.io.IoUtil;
import com.feifei.pojo.User;
import com.feifei.service.UserService;
import com.feifei.service.impl.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * 用户信息的controller
 */

@RestController // 将controller的返回数据，写入HTTP响应体。如果说返回是对象或者是集合，则会自动转为json数据


public class UserController {

    @Autowired // 应用程序时，会自动查询该类型的Bean对象，并且赋值给改成员变量
    private UserService userService;
    @RequestMapping("/list")
//    public List<User> list() throws  Exception{
//        // 1. 加载并读取user.txt，获取用户数据
//        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
//        ArrayList<String> lines = IoUtil.readLines(in, StandardCharsets.UTF_8, new ArrayList<>());
//
//        // 2. 解析用户信息，封装为user对象 -> list集合
//        List<User> userList = lines.stream().map(line -> {
//            String[] split = line.split(",");
//            Integer id = Integer.parseInt(split[0]);
//            String username = split[1];
//            String password = split[2];
//            String name = split[3];
//            Integer age = Integer.parseInt(split[4]);
//            LocalDateTime updateTime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//            return new User(id, username, password, name, age, updateTime);
//
//        }).toList();
//
//        // 3. 返回数据（json）
//        return userList;
//    }
//    }

    public List<User> list() throws Exception {
        // 1. 调用service层，获取用户数据
        List<User> userList = userService.findAll();

        // 2. 返回数据（json）
        return userList;
    }
}
        
        
        
    

    