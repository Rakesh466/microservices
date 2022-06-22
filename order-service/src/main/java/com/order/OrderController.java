package com.order;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
	OrderService orderService;
@PostMapping
public void createOrder(@Valid @RequestBody Order order) {
	System.out.println("Working:"+order.getPrice());
	System.out.println("order:"+order.toString());
	orderService.insertOrder(order);
}
@GetMapping("/{id}")
public Order getOrder(Integer id) {
	System.out.println("getOrder");
	return new Order();
}
}
