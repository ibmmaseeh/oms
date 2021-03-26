package com.ibm.demo.service;

import java.util.ArrayList;

import java.util.List;

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
