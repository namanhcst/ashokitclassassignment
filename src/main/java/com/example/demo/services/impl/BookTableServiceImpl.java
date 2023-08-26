package com.example.demo.services.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.BookTable;
import com.example.demo.repos.BookTableRepo;
import com.example.demo.services.BookTableService;
import com.example.demo.utils.ExcelUtils;

@Service
public class BookTableServiceImpl implements BookTableService {
	
	@Autowired
	public BookTableRepo bookTablerepository;
	
	
	public List<BookTable> saveBooks(){
		
		BookTable book1 = new BookTable("BookName1", 1200.50,"Programming");
		BookTable book2 = new BookTable("BookName2", 1201.50,"Programming");
		BookTable book3 = new BookTable("BookName3", 1202.50,"Programming");
		
		return bookTablerepository.saveAll(Arrays.asList(book1,book2,book3));
		
		
	}
	
	public List<BookTable> getAllBooks(){
		
		return bookTablerepository.findAll();
	}
	
	public void pushDataToExcel(List<BookTable> bookdata) {
		
		ExcelUtils.pushData(bookdata);
	}

}
