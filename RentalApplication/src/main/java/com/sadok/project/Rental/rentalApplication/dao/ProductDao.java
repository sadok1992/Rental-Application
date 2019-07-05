package com.sadok.project.Rental.rentalApplication.dao;

import java.util.ArrayList;
import java.util.List;

import com.sadok.project.Rental.rentalApplication.domain.Product;

public class ProductDao {

	private List<Product> products = new ArrayList<>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public List<Product> listProducts() {
		return products;
	}

}
