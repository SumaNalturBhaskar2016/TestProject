package com.springdemo.springbootbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class aStudentService {
	
@Autowired
private aStudentRepository studentRepo;
	
	public astu createStudent(astu stu) {
		return studentRepo.save(stu);
		
	}
	
	public List<astu> getAllUser() {
		return studentRepo.findAll();
	}
	
	
	public astu getUserById(Long Id) {
		return studentRepo.findById(Id).get();
	}
	
	public astu updateUser(astu stu) {
		astu extingUser= studentRepo.findById(stu.getRollNo()).get();
		extingUser.setFirstName(stu.getFirstName());
		System.out.print("hello"+extingUser);
		studentRepo.save(extingUser);
		return extingUser;
	}

	public String deleteById(Long Id) {
		 studentRepo.deleteById(Id);
		 return "deleted the user";
	}
	
	
}
