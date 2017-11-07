package com.siemens.spring.core;

public class Address {
	private int addressId;
	private String street;
	private String city;
	
	public Address() {}

	public Address(int addressId, String street, String city) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
	}



	public int getAddressId() {
		return addressId;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
