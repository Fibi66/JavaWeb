package com.feifei.mapper;

import com.feifei.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * //应用程序在运行时，会自动的为该接口创建一个实现类（代理对象）
 * 会放到IOC容器中
 */
@Mapper
public interface UserMapper {

    // 查询所有用户
    @Select("select * from user")
    public List<User> findAll();

    // 根据ID删除 用户
    @Delete("delete from user where id = #{id}")
    public void deleteById(Integer id);

    // 添加用户
    @Insert("insert into user(username, password, name, age) values(#{username}, #{password}, #{name}, #{age})")
    public void addUser(User user);

    // 修改用户
    @Update("update user set username = #{username}, password = #{password}, name = #{name}, age = #{age} where id = #{id}")
    public void updateUser(User user);

    // 查询用户根据ID
    @Select("select * from user where username = #{username} and password = #{password}")
    public User findByUsernameandPassword(@Param("username") String username, @Param("password") String password);
}
