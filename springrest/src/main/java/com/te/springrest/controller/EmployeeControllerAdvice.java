package com.te.springrest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.springrest.beans.EmployeeResponse;
import com.te.springrest.customexp.EmployeeException;

@RestControllerAdvice
public class EmployeeControllerAdvice {

	@ExceptionHandler(EmployeeException.class)
	public EmployeeResponse handleEmployeeException(EmployeeException exception) {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(500);
		response.setMsg("Failure");
		response.setDescription(exception.getMessage());
		return response;
	}
}