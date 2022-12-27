package com.jsp.Controller;

import com.jsp.dto.Product;
import com.jsp.sevice.ProductService;

public class GetAllProduct {
public static void main(String[] args) {
	
	ProductService productService = new ProductService();
	
	Product product = new Product();
	
	Product product2 = productService.getAllProduct(product);
	
	
	
}
}
