package com.example.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.employeemanagement.exceptions.BusinessServiceException;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/get/employees")
	public ResponseEntity<List<Employee>> getEmployees() {
		try {
			List<Employee> employees = employeeService.getEmployees();
			return ResponseEntity.ok(employees);
		} catch (BusinessServiceException e) {
			return (ResponseEntity<List<Employee>>) ResponseEntity.internalServerError();
		}

	}
}
