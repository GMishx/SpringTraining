package com.siemens.spring.test.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.core.Employee;
import com.siemens.spring.core.HelloWorld;

// @SuppressWarnings("deprecation")
public class CoreTest {

	public static void main(String[] args) {
		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src\\beans.xml"));
		// HelloWorld theBean = (HelloWorld) factory.getBean("helloWorld");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld theBean = (HelloWorld) context.getBean("helloWorld");
		System.out.println(theBean.getMessage());

		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp2", Employee.class);

		printEmployee(emp1);
		printEmployee(emp2);

		((ConfigurableApplicationContext) context).close();
	}

	static private void printEmployee(Employee emp) {
		StringBuilder sb = new StringBuilder();
		sb.append("ID: ").append(emp.getId());
		sb.append(", Name: ").append(emp.getName());
		sb.append(", Salary: ").append(emp.getSalary());
		sb.append(", Address ID: ").append(emp.getAddress().getAddressId());
		sb.append(", Street: ").append(emp.getAddress().getStreet());
		sb.append(", City: ").append(emp.getAddress().getCity());
		System.out.println(sb);
	}

}
