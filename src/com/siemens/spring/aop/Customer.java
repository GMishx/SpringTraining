package com.siemens.spring.aop;

public class Customer {

	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public Customer setName(String name) {
		this.name = name;
		return this;
	}

	public Customer setUrl(String url) {
		this.url = url;
		return this;
	}

	public void printName() {
		System.out.println("Customer name: " + this.getName());
	}

	public void printURL() {
		System.out.println("Customer URL: " + this.getUrl());
	}

	public void throwsExceptionMethod() throws Exception {
		throw new Exception();
	}

	@Override
	public String toString() {
		return "Name: " + this.getName() + ", URL: " + this.getUrl();
	}
}
