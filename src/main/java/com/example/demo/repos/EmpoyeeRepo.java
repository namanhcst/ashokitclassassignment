package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;


@Repository
public interface EmpoyeeRepo extends JpaRepository<Employee, Integer> {

}
