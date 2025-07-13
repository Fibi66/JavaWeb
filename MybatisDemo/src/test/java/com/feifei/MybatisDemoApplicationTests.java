package com.feifei;

import com.feifei.mapper.UserMapper;
import com.feifei.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest //单元测试的注解，当前测试类中的测试方法运行时会启动springboot项目----IOC容器
class MybatisDemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testFindAll() {
		List<User> users = userMapper.findAll();
		users.forEach(System.out::println);
	}

	@Test
	public void testDeleteById() {
		userMapper.deleteById(5);
	}

}
