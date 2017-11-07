package com.siemens.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.core.Employee;
import com.siemens.spring.service.EmployeeService;
import com.siemens.spring.service.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService es = context.getBean("employeeService", EmployeeServiceImpl.class);
		es.updateEmployee(new Employee(12, "SRS", 35, null));
		((ConfigurableApplicationContext) context).close();
	}

}
