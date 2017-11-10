package com.siemens.spring.test.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.User;
import com.siemens.spring.service.UserService;

public class UserUpdateTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("userhibernate.xml");

		UserService service = context.getBean("userService", UserService.class);

		User user = context.getBean("user", User.class);
		user.setUserName("Gaurav").setPassword("password").setAge(22).setGender('M');

		service.updateUser(user);

		((ConfigurableApplicationContext) context).close();

	}

}
