package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entities.Products;
import com.example.demo.services.ProductsService;

@SpringBootApplication
public class ProductAssignment3Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(ProductAssignment3Application.class, args);
		ProductsService productService = context.getBean(ProductsService.class);
		List<Products> p = productService.saveFewProducts();
		productService.exportToPdf(p);
	
	

		

	}

}
