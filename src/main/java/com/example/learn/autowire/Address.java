package com.example.learn.autowire;

public class Address {

	private String Street;
	private String zipCode;
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", zipCode=" + zipCode + "]";
	}
	
	
	
}
