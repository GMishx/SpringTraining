package com.siemens.spring.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.aop.Customer;

public class CustomerThrowsAspectTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("aopBeans.xml");
		Customer custOne = context.getBean("customerThrowsProxy", Customer.class);

		custOne.printName();
		custOne.printURL();

		try {
			custOne.throwsExceptionMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			((ConfigurableApplicationContext) context).close();
		}

	}

}
