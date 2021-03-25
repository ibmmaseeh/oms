package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo.entitiy.Order;

@Service
public class OrderService {//Spring Beans.
	public String createOrder(Order order) {
		return "order success";
		
	}

	public Order getOrder(int orderId) {
		// TODO Auto-generated method stub
		return new Order();
	}	
	
	public void updateOrder(int orderId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteOrder(int orderId) {
		// TODO Auto-generated method stub
		System.out.println("order deleted");
		
	}

	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return new ArrayList<Order>();
	}

}
