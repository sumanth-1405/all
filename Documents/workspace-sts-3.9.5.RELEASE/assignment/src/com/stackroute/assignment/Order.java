package com.stackroute.assignment;

public class Order {
	
	private String[] order;
	private String category;
	private int quantity;
	
	public Order(String[] order ,String category ,int quantity){
		this.order=order;
		this.category=category;
		this.quantity=quantity;
	}
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String[] getOrder() {
		return order;
	}

	public void setOrder(String[] order) {
		this.order = order;
	}



}
