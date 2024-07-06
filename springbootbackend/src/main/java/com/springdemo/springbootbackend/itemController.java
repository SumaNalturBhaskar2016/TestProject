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
public class itemController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	//http://localhost:8080/createItem
	@PostMapping("/createItem")
	public items createItem(@RequestBody items item){
		return itemRepository.save(item);
	}
	
	//http://localhost:8080/getItems
	@GetMapping("/getItems")
	public List<items> getItem() {
		return itemRepository.findAll();
	}

	
	@GetMapping("/getItems/{id}")
	public items findtheOrder(@PathVariable("id") Long  ItemNo) {
		return itemRepository.findById(ItemNo).get();
		
	}
	
	
	


}
