package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;
import com.example.demo.utils.FileUtils;

@SpringBootApplication
public class EmployeeAssignments1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(EmployeeAssignments1Application.class, args);
		EmployeeService empService = context.getBean(EmployeeService.class);

		String imagePath = "C:\\Users\\Naman\\Desktop\\empData\\empImage.jpg";
		String resumePath = "C:\\Users\\Naman\\Desktop\\empData\\empResume.pdf";

		String outputImagePath = "C:\\Users\\Naman\\Desktop\\empData\\output\\empImage.jpg";
		String outputResumePath = "C:\\Users\\Naman\\Desktop\\empData\\output\\empResume.pdf";

		empService.saveEmp("Naman",
		FileUtils.covertFilesToBase64EncodedString(imagePath),
		FileUtils.covertFilesToBase64EncodedString(resumePath));

		Optional<Employee> emp = empService.getEmpByID(1);

		emp.ifPresent(employee -> {
			FileUtils.CreateFileFromFileEncodedSring(outputImagePath, employee.getImage());
			FileUtils.CreateFileFromFileEncodedSring(outputResumePath, employee.getResume());
		});

	}

}
