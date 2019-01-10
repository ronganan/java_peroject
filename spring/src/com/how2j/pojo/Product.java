package com.how2j.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("p")
public class Product {
	
	private int id;
	private String name = "product-1";
	
	@Autowired
	private Category category;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Category getCategory() {
		return category;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name; 
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}