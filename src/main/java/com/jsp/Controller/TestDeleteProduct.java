package com.jsp.Controller;

import com.jsp.dto.Product;
import com.jsp.sevice.ProductService;

public class TestDeleteProduct {
public static void main(String[] args) {
	
	ProductService productService = new ProductService();
	
	Product product = new Product();
	product.setId(6);
	
	
	Product product2 = productService.deleteProduct(product);
	if (product2 != null) {
		System.out.println("Product Deleted");
	} else {
       System.out.println("Not Deleted");
	}
}
}
