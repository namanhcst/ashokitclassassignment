package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.BookTable;

@Repository
public interface BookTableRepo extends JpaRepository<BookTable, Long> {

}
