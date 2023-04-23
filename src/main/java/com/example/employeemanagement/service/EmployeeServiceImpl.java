package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.employeemanagement.exceptions.BusinessServiceException;
import com.example.employeemanagement.exceptions.DataServiceException;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployees() throws BusinessServiceException {
		try {
			List<Employee> employees = employeeRepository.getEmployees();
			return employees;
		} catch (DataServiceException e) {
			throw new BusinessServiceException(e.getMessage(), e);
		}
	}
}
