package com.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
@Autowired
OrderRepository orderRepository;

@Autowired
RestTemplate restTemplate;


public void insertOrder(Order order)
{
	ResponseEntity<String> result=restTemplate.getForEntity("http://EMAIL-SERVICE/email/"+order.getEmail(),String.class);
	System.out.println("result::"+result.getBody());
	orderRepository.save(order);
	}
}
