package com.springdemo.springbootbackend;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="items")
public class items {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ItemNo;
	
	@Column(name="item_name")
	private String ItemName;
	
	@Column(name="item_Quantity")
	private Long ItemQuantity;
	
	@Column(name="price")
	private Long price;
	
	
	public Long getItemNo() {
		return ItemNo;
	}

	public void setItemNo(Long itemNo) {
		ItemNo = itemNo;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public Long getItemQuantity() {
		return ItemQuantity;
	}

	public void setItemQuantity(Long itemQuantity) {
		ItemQuantity = itemQuantity;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "items [ItemNo=" + ItemNo + ", ItemName=" + ItemName + ", ItemQuantity=" + ItemQuantity + ", price="
				+ price + "]";
	}
	
	
	
	

}
