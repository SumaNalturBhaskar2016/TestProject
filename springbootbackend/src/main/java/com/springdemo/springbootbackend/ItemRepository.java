package com.springdemo.springbootbackend;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<items,Long>{
	


}
