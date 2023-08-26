package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Products;

public interface ProductsService {

	public List<Products> saveFewProducts();

	public void exportToPdf(List<Products> p);

}
