package com.ibm.demo.service;

import org.springframework.stereotype.Service;

import com.ibm.demo.entitiy.Order;

@Service
public class OrderService {//Spring Beans.
	public String createOrder(Order order) {
		return "order success";
		
	}
	

}
