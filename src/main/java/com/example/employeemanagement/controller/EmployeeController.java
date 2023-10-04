package com.example.employeemanagement.controller;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.employeemanagement.exceptions.BusinessServiceException;
import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	private static Logger logger = Logger.getLogger(EmployeeController.class);

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees() {
		try {
			logger.debug("getting employees");
			List<Employee> employees = employeeService.getEmployees();
			return ResponseEntity.ok(employees);
		} catch (BusinessServiceException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer employeeId){
		try {
		logger.info("Getting employee object");
		Employee employee = employeeService.getEmployee(employeeId);
		return ResponseEntity.ok(employee);
		}catch (BusinessServiceException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
