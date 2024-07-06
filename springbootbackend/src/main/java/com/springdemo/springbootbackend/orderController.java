package com.springdemo.springbootbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ItemRepository itemRepository;
	
	//http://localhost:8080/createOrder
	@PostMapping("/createOrder")
	public order createOrder(@RequestBody order ord){
		return orderRepository.save(ord);
	}
	
	///http://localhost:8080/getOrder
	@GetMapping("/getOrder")
	public List<order> getOrder() {
		return orderRepository.findAll();
	}
	
	@GetMapping("/getOrder/{id}")
	public order findtheOrder(@PathVariable("id") Long  orderNo) {
		order ord= orderRepository.findById(orderNo).get();
		//items itr=  itemRepository.findById(orderNo).get();
		//ord.getOrderHasItems().add(itr);
		return ord;
	}
	
	///http://localhost:8080/getOrder/findQuery
	@GetMapping("/getOrder/findQuery")
	public List<OrderResponse> findOrder() {
		List<OrderResponse> ord= orderRepository.findbyQuery();
		System.out.println("hello suma"+ ord);
		//items itr=  itemRepository.findById(orderNo).get();
		//ord.getOrderHasItems().add(itr);
		return ord;
	}
	
	/*
	 * ///http://localhost:8080/getItemsQuery
	 * 
	 * @GetMapping("/getItemsQuery")
	 * 
	 * @Query("select * from order o left join items t on o.orderNo = t.ItemNo")
	 * public List<order> findthe(@PathVariable("id") Long ItemNo) { return
	 * orderRepository.findbyQuery();
	 * 
	 * }
	 */

}
