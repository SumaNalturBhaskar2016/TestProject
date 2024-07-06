package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Student1 {
	
	int rollNum;
	int mark;
	

	public Student1(int rollNum, int mark) {
		super();
		this.rollNum = rollNum;
		this.mark = mark;
	}


	public int getRollNum() {
		return rollNum;
	}


	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}


	public int getMark() {
		return mark;
	}


	public void setMark(int mark) {
		this.mark = mark;
	}


	@Override
	public String toString() {
		return "Student1 [rollNum=" + rollNum + ", mark=" + mark + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1= new Student1(143,25);
		Student1 s2= new Student1(144,25);
		Student1 s3= new Student1(142,12);
		
		List<Student1> studentList=Arrays.asList(s1,s2,s3);
		//List<Integer> l= new ArrayList<Integer>();
		Map<Integer,List<Integer>> mm= new TreeMap<>();
		List<Integer> l2= new ArrayList<Integer>();
		List<Integer> l= new ArrayList<Integer>();
		for(Student1 sobj: studentList ) {
			if(mm.containsKey(sobj.getMark())) {
			
				l2.add(sobj.getRollNum());
				
				mm.put(sobj.getMark(),l2);
			}
			else {
				
				l.add(sobj.getRollNum());
				mm.put(sobj.getMark(),l);
			
			}
		}
		
		
		System.out.print("su,aaa");
		
		Map<Integer,List<Student1>> m= studentList.stream().collect(Collectors.groupingBy(Student1::getMark));
		Map<Integer,Long> m2= studentList.stream().collect(Collectors.groupingBy(Student1::getMark,TreeMap::new,Collectors.counting()));
		Map<Integer,List<Integer>> m1= studentList.stream().collect(Collectors.groupingBy(Student1::getMark,
				Collectors.mapping(Student1::getRollNum, Collectors.toList())));
				
		System.out.print(m);	
		System.out.print(m2);
		System.out.print(m1);
		System.out.print(mm);
	}

}
