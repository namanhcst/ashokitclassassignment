package com.example.demo.services.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.repos.EmpoyeeRepo;
import com.example.demo.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmpoyeeRepo emprepo;
	
	@Override
	public void saveEmp(String name, String image, String resume) {
		
		Employee emp = new Employee();
		emp.setImage(image);
		emp.setName(name);
		emp.setResume(resume);
		
		emprepo.save(emp);
		
	}
	
	public Optional<Employee> getEmpByID(Integer id) {
		
		Optional<Employee> emp = emprepo.findById(id);
		
		return emp;
		
	}

}
