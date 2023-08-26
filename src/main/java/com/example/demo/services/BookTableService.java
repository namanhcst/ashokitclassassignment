package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.BookTable;

public interface BookTableService {
	
	public List<BookTable> saveBooks();
	
	public List<BookTable> getAllBooks();
	
	public void pushDataToExcel(List<BookTable> bookdata);
	

}
