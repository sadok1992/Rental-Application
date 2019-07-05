package com.sadok.project.Rental.rentalApplication.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rental {
	
	private Date formDate;
	private Date toDate;
	private Customer customer;
	private Product product;

}
