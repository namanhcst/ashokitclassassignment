package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.BookTable;
import com.example.demo.services.BookTableService;

@SpringBootApplication
public class BookTableAssignments2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BookTableAssignments2Application.class, args);
		BookTableService bookService = context.getBean(BookTableService.class);
	
		//saving 3 books in DB, check service class
		bookService.saveBooks();
		
		List<BookTable> books = bookService.getAllBooks();
		
		bookService.pushDataToExcel(books);

		

	}

}
