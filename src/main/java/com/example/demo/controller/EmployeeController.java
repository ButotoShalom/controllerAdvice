package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.exceptions.ErrorObject;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService eService;
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee (@PathVariable Integer id) {
		return eService.getEmployee(id);
	}
	
	
	
}
