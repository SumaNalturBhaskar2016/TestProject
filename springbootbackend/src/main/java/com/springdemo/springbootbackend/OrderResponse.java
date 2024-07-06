package com.springdemo.springbootbackend;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class OrderResponse {
	
	private String OrderName;
	private String  ItemName;
	
	public OrderResponse(String orderName, String itemName) {
		super();
		OrderName = orderName;
		ItemName = itemName;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		this.OrderName = orderName;
	}

	
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	@Override
	public String toString() {
		return "OrderResponse [OrderName=" + OrderName + "]";
	}

	/*
	 * public String getItemName() { return ItemName; } public void
	 * setItemName(String itemName) { ItemName = itemName; }
	 */
	
	
	
	
	

}
