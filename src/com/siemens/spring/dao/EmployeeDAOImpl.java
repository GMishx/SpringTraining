package com.siemens.spring.dao;

import com.siemens.spring.core.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void insertEmployee(Employee emp) {
		System.out.println("Inserting employee: " + emp.getName());
	}

	@Override
	public void deleteEmployee(int empId) {
		System.out.println("Deleting employee: "+empId);
	}

	@Override
	public void updateEmployee(Employee emp) {
		System.out.println("Updating employee: " + emp.getName());
	}

	@Override
	public void fetchEmployeeById(int empId) {
		System.out.println("Fetching employee: " + empId);
	}

	@Override
	public void fetchAllEmployees() {
		System.out.println("Fetching all employees");
	}

}
