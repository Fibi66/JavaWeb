package com.feifei.service.impl;

import com.feifei.dao.UserDao;
import com.feifei.dao.impl.UserDaoimpl;
import com.feifei.pojo.User;
import com.feifei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service

public class UserServiceimpl implements UserService {
     //属性注入
    @Autowired
    private UserDao userDao;

//    构造器注入
//    private final UserDao userDao;
//    public UserServiceimpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    setter方式注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public List<User> findAll() {
        // 1. 调用dao获取数据
        List<String> lines = userDao.findAll();

        // 2. 解析用户信息，封装为user对象 -> list集合

        List<User> userList = lines.stream().map(line -> {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[0]);
            String username = split[1];
            String password = split[2];
            String name = split[3];
            Integer age = Integer.parseInt(split[4]);
            LocalDateTime updateTime = LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return new User(id, username, password, name, age, updateTime);

        }).toList();
        return userList;
    }

    }

