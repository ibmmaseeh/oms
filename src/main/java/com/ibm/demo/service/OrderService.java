package com.ibm.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.demo.OrderRepository;
import com.ibm.demo.entitiy.Order;

@Service
public class OrderService {//Spring Beans.
	@Autowired
	OrderRepository orderRepository;
	public String createOrder(Order order) {
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();
		
	}
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	public Optional<Order> getOrder(String orderId) {
		// TODO Auto-generated method stub
		return orderRepository.findById(orderId);
	}	
	
	public void updateOrder(Order order) {
		orderRepository.save(order);
		// TODO Auto-generated method stub
		
	}

	public void deleteOrder(int  orderId) {
		// TODO Auto-generated method stub
		System.out.println("order deleted");
		
	}

	

}
