package com.example.demo.services.impl;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Products;
import com.example.demo.repos.ProductsRepo;
import com.example.demo.services.ProductsService;
import com.example.demo.utils.PdfUtils;
import com.lowagie.text.DocumentException;


@Service
public class ProductServiceImpl implements ProductsService {
	
	@Autowired
	private ProductsRepo productsRepo;	
	
	
	public List<Products> saveFewProducts() {
		
		Products p1 = new Products("Daal", 180.00, "Food");
		Products p2 = new Products("Rice", 110.00, "Food");
		Products p3 = new Products("Tomato", 100.00, "Veg");
		Products p4 = new Products("Flower", 10.00, "Decor");
		Products p5 = new Products("Salt", 40.00, "Food");
		Products p6 = new Products("Snacks", 740.00, "Food");
		Products p7 = new Products("Corn", 100.00, "Veg");
		Products p8 = new Products("Ladyfinger", 50.00, "Veg");
		
		return productsRepo.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));

	}
	
	public void exportToPdf(List<Products> p) {
		
		try {
			PdfUtils.export(p);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
