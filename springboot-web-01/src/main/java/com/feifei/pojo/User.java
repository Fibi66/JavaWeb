package com.feifei.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor

// 用户实体类
public class User {

    private Integer id; // 用包装类，不用int。因为int是默认类型是0。如果业务是0，那就分不清楚了
    private String username;
    private String password;
    private String name;
    private Integer age;
    private LocalDateTime updateTime;


}
