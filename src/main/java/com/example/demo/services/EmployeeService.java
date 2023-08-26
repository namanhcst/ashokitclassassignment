package com.example.demo.services;

import java.util.Optional;

import com.example.demo.entities.Employee;

public interface EmployeeService {
	
	public void saveEmp(String name, String image, String resume);
	
	public Optional<Employee> getEmpByID(Integer id);

}
