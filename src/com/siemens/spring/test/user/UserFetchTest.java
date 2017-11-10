package com.siemens.spring.test.user;

import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.bean.User;
import com.siemens.spring.service.UserService;

public class UserFetchTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("userhibernate.xml");

		UserService service = context.getBean("userService", UserService.class);

		ListIterator<User> users = service.fetchAllUsers();

		while (users.hasNext()) {
			System.out.println(users.next());
		}

		((ConfigurableApplicationContext) context).close();

	}

}
