package com.jsp.Controller;

import com.jsp.dto.Product;
import com.jsp.sevice.ProductService;

public class TestSaveProduct {

	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		Product product =new Product();
		product.setName("Shirt");
		product.setBrand("Zara");
		product.setType("Clothing");
		product.setPrice(2000);
		
		Product product2 =productService.saveProduct(product);
		if (product2 != null) {
			System.out.println("Product Inserted");
		} else {
			System.out.println("Not Inserted");
		}
	}
}
