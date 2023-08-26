package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class BookTable {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	private String bookName;
	
	private Double bookValue;
	
	private String bookCategory;

	public String getBookName() {
		return bookName;
	}
	public Long getId() {
		return id;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookValue() {
		return bookValue;
	}
	
	public BookTable() {
		
	}

	public BookTable(String bookName, Double bookValue, String bookCategory) {
		super();
		this.bookName = bookName;
		this.bookValue = bookValue;
		this.bookCategory = bookCategory;
	}

	public void setBookValue(Double bookValue) {
		this.bookValue = bookValue;
	}

	public String getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}

}
