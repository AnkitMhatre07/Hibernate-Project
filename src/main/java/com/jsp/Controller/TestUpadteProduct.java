package com.jsp.Controller;

import com.jsp.dto.Product;
import com.jsp.sevice.ProductService;

public class TestUpadteProduct {
public static void main(String[] args) {
	
	ProductService productService = new ProductService();
	
	Product product = new Product();
	product.setId(3);
	product.setName("Tshirt");
	
	
	Product product2 = productService.updateProduct(product);
	
	if(product2 != null) {
		System.out.println("Product Updated");
	}
	else {
		System.out.println("Not Updated");
	}
	
}
}
