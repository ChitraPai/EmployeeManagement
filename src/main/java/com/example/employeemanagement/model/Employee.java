package com.example.employeemanagement.model;

import java.util.Date;

public class Employee {
	private Integer id;
	private String name;
	private Integer salary;
	private Date dateofjoining;

	public Employee(Integer id, String name, Integer salary, Date dateofjoining) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateofjoining = dateofjoining;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Date getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(Date dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

}
