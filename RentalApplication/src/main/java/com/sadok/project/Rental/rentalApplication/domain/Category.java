package com.sadok.project.Rental.rentalApplication.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Category {
	
	private String name;
	private String description;
	private Category parentCategory;

}
