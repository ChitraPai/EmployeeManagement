package com.example.employeemanagement.repository;

import java.util.List;

import com.example.employeemanagement.exceptions.DataServiceException;
import com.example.employeemanagement.model.Employee;

public interface EmployeeRepository {
	public List<Employee> getEmployees() throws DataServiceException;

}
