package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}
	int rollNo;
	String Name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + Name + "]";
	}
	
	
	public static void main(String[] args) {
		Student s1= new Student(25,"suma");
		Student s2= new Student(25,"xyz");
		Student s3= new Student(12,"abc");
		
		
		
		
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		//Collections.sort(studentList,new SortStudent());
		//Collections.sort(studentList,new SortStudentName());

		List<Student> studentList1 = studentList.stream()
				.sorted(Comparator.comparing(Student::getRollNo).thenComparing(Student::getName))
				.collect(Collectors.toList());
		System.out.println("Sorted" + studentList1);
		
		
		
		
	}
	
	
}
