package com.practice.bean;

public class Product {
	int id,qty;
	String name;
	float price;
	
	public Product(int id, String name, int qty, float price) {
		super();
		this.id = id;
		this.qty = qty;
		this.name = name;
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", qty=" + qty + ", name=" + name + ", price=" + price + "]";
	}

}
