package com.sadok.project.Rental.rentalApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sadok.project.Rental.rentalApplication.domain.Product;
import com.sadok.project.Rental.rentalApplication.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping
	public void getProducts(){
		productService.retrieveProducts();
		System.out.println("show List of Products");
		
		
	}
	
	@PostMapping
	public void addProduct(){
		productService.addProduct(new Product());
		System.out.println("Adding new Product");
	}
 
}
