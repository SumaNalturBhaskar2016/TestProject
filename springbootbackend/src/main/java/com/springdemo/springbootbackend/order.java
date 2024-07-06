package com.springdemo.springbootbackend;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="orderitem")
public class order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderNo;
	
	@Column(name="order_name")
	private String OrderName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_orderNo")
	private List<items> orderHasItems= new ArrayList<items>();

	public Long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}

	public String getOrderName() {
		return OrderName;
	}

	public List<items> getOrderHasItems() {
		return orderHasItems;
	}

	public void setOrderHasItems(List<items> orderHasItems) {
		this.orderHasItems = orderHasItems;
	}

	public void setOrderName(String orderName) {
		OrderName = orderName;
	}

	@Override
	public String toString() {
		return "order [orderNo=" + orderNo + ", OrderName=" + OrderName + "]";
	}
	
	
	

}
