package com.example.employeemanagement.service;

import java.util.List;

import com.example.employeemanagement.exceptions.BusinessServiceException;
import com.example.employeemanagement.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees() throws BusinessServiceException;
	
	public Employee getEmployee(Integer employeeId) throws BusinessServiceException;
}
