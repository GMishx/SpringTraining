package com.siemens.spring.service;

import com.siemens.spring.core.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);

	void deleteEmployee(int empId);

	void updateEmployee(Employee emp);

	void fetchEmployeeById(int empId);

	void fetchAllEmployees();
}
