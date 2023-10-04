package com.example.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.exceptions.BusinessServiceException;
import com.example.employeemanagement.exceptions.DataServiceException;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;
@Service
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

	@Override
	public Employee getEmployee(Integer employeeId) throws BusinessServiceException {
		try {
			Employee employee = employeeRepository.getEmployee(employeeId);
			return employee;
		}catch (DataServiceException e){
			throw new BusinessServiceException(e.getMessage(), e);
		}
	}
}
