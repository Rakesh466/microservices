package com.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDER_RM")
public class Order {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
	
private String item;
private float price;
private String email;
private int quantity;
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getItem() {
	return item;
}

public void setItem(String item) {
	this.item = item;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

@Override
public String toString() {
	return "Order [id=" + id + ", item=" + item + ", price=" + price + "]";
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
