package com.example.employeemanagement.exceptions;

public class BusinessServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BusinessServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
