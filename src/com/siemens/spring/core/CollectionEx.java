package com.siemens.spring.core;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.siemens.spring.service.EmployeeService;

public class CollectionEx implements InitializingBean, DisposableBean {
	private List aList;
	private Set aSet;
	private Map aMap;

	public List getaList() {
		return aList;
	}

	public Set getaSet() {
		return aSet;
	}

	public Map getaMap() {
		return aMap;
	}

	public void setaList(List aList) {
		this.aList = aList;
	}

	public void setaSet(Set aSet) {
		this.aSet = aSet;
	}

	public void setaMap(Map aMap) {
		this.aMap = aMap;
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CollectionEx theBean = context.getBean("collectionExample", CollectionEx.class);
		System.out.println(theBean.getaList());
		System.out.println(theBean.getaSet());
		System.out.println(theBean.getaMap());
		SingletonExample sinBean = context.getBean("singletonBean", SingletonExample.class);
		System.out.println(sinBean);
		EmployeeService serBean = context.getBean("empService", EmployeeService.class);
		System.out.println(serBean);
		
		((ConfigurableApplicationContext) context).close();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("I am initialized");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("I am being destroyed");
	}
}
