package com.ibm.demo.entitiy;

import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

public class Order {
	@NonNull
	@NotBlank
	private String item;
	private float price;
	private int id;
	public String getItem() {
		return item;
		
	}
	public void setItem(String item) {
		this.item= item;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price<=0) {
			throw new IllegalArgumentException("Price cannot be negative");	
		}
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
