package com.springdemo.springbootbackend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<order, Long>  {

	@Query("SELECT new com.springdemo.springbootbackend.OrderResponse(a.OrderName,k.ItemName) FROM order a JOIN a.orderHasItems k")
	public List<OrderResponse> findbyQuery();
	
	//@Query("SELECT new com.springdemo.springbootbackend.OrderResponse(a.OrderName,i.ItemName) FROM order a JOIN a.orderHasItems i")
	
	

	
}
