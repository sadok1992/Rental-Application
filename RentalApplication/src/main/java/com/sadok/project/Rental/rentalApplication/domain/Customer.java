package com.sadok.project.Rental.rentalApplication.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Address address;

}
