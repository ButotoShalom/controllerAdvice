package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exceptions.NoDataFoundException;
import com.example.demo.exceptions.ResourceNotFoundException;

@Service
public class EmployeeService {

	private static List<Employee> list = new ArrayList<>();
	
	static {
		list.add(new Employee(1, "Employee 1", 28, "Burundi"));
		list.add(new Employee(2, "Employee 2", 18, "Burundi"));
		list.add(new Employee(3, "Employee 3", 38, "Burundi"));
		list.add(new Employee(4, "Employee 4", 48, "Burundi"));
		list.add(new Employee(5, "Employee 5", 58, "Burundi"));
	}
	
	public List<Employee> getlist(){
		if (list.size() > 0) {
			return list;
		}
		throw new NoDataFoundException("no employees data found");
	}
	
	public Employee getEmployee (Integer id) {
		Optional<Employee> theEmployee = list.stream().filter(e -> e.getId() == id).findFirst();
		if (!theEmployee.isPresent()) {
			throw new ResourceNotFoundException("Employee is not found for the id->" + id);
		}
		return theEmployee.get();
	}
}
