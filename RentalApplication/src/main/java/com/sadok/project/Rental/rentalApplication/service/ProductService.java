package com.sadok.project.Rental.rentalApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadok.project.Rental.rentalApplication.dao.ProductDao;
import com.sadok.project.Rental.rentalApplication.domain.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public void addProduct(Product product){
		productDao.addProduct(product);
	}
	
	public List<Product> retrieveProducts(){
		return productDao.listProducts();
	}
	

}
