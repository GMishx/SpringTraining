package com.siemens.spring.dao;

import com.siemens.spring.core.Employee;

public interface EmployeeDAO {
	void insertEmployee(Employee emp);

	void deleteEmployee(int empId);

	void updateEmployee(Employee emp);

	void fetchEmployeeById(int empId);

	void fetchAllEmployees();
}
