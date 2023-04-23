package com.example.employeemanagement.repository;

import java.util.*;

import org.springframework.stereotype.Component;

import com.example.employeemanagement.exceptions.DataServiceException;
import com.example.employeemanagement.model.Employee;
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public List<Employee> getEmployees() throws DataServiceException {
		try {
			List<Employee> employees = new ArrayList<Employee>();
			Employee employee1 = new Employee(1, "A", 100, new Date(10));
			Employee employee2 = new Employee(2, "B", 200, new Date(20));
			Employee employee3 = new Employee(3, "C", 300, new Date(30));
			employees.add(employee1);
			employees.add(employee2);
			employees.add(employee3);
			return employees;
		} catch (Exception e) {
			throw new DataServiceException(e.getMessage(), e);
		}
	}
}
