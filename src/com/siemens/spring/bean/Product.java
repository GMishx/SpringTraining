package com.siemens.spring.bean;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Product {
	private int id = 100;
	private String name;
	private double price;
	private String description;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	@Required
	@Value("100")
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ id: ");
		sb.append(this.id);
		sb.append(", Name: ");
		sb.append(this.name);
		sb.append(", Price: ");
		sb.append(this.price);
		sb.append(", Description: ");
		sb.append(this.description);
		sb.append(']');
		return sb.toString();
	}

}
