package com.springdemo.springbootbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class astudentController {
	
	@Autowired
	private aStudentService studentService;
	
	@PostMapping("/save1")
	public  ResponseEntity<astu> createStudent(@RequestBody astu stu) {
		astu createdUser=studentService.createStudent(stu);
		System.out.println("hii created");	
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/get1")
	public List<astu> getAllUser() {
		return studentService.getAllUser();
	}
	
	@GetMapping("{id}")
	public astu getUserByID(@PathVariable("id") Long  rollNo) {
		return studentService.getUserById(rollNo);
	}
	
	
	@PutMapping("/chg/{id}")
	public astu updateUser(@PathVariable("id") Long  rollNo,@RequestBody astu  stu) {
		stu.setRollNo(rollNo);
		return studentService.updateUser(stu);
	}
	
	@DeleteMapping("{id}")
	public String deleteById(@PathVariable("id") Long rollNo) {
		return studentService.deleteById(rollNo);
	 }
	

}
