package com.siemens.spring.service;

import com.siemens.spring.core.Employee;
import com.siemens.spring.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO dao;

	public EmployeeDAO getDao() {
		return dao;
	}

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public void insertEmployee(Employee emp) {
		dao.insertEmployee(emp);
	}

	@Override
	public void deleteEmployee(int empId) {
		dao.deleteEmployee(empId);
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.updateEmployee(emp);
	}

	@Override
	public void fetchEmployeeById(int empId) {
		dao.fetchEmployeeById(empId);
	}

	@Override
	public void fetchAllEmployees() {
		dao.fetchAllEmployees();
	}

}
