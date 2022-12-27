package com.jsp.Controller;

import com.jsp.dto.Product;
import com.jsp.sevice.ProductService;

public class GetProductById {
public static void main(String[] args) {
	
	ProductService productService = new ProductService();
	
	Product product = new Product();
	product.setId(1);
	
	Product product2 =productService.getProduct(product);
	
	
}
}
