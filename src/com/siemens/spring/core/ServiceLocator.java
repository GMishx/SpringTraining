package com.siemens.spring.core;

import com.siemens.spring.service.EmployeeService;
import com.siemens.spring.service.EmployeeServiceImpl;

public class ServiceLocator {

	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
	}
}
