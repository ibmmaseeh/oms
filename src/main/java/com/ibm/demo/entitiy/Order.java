package com.ibm.demo.entitiy;

import org.springframework.lang.NonNull;

public class Order {
	@NonNull
	private String item;
	private float price;
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
	

}
