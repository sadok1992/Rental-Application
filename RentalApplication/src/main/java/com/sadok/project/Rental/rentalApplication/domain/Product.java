package com.sadok.project.Rental.rentalApplication.domain;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

	private String name;
	private String description;
	private List<Category> categories;
}
