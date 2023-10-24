package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demostream{

	
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(4);
		l.add(7);
		l.add(6);
		l.add(2);
		List<List<Integer>> l2= new ArrayList<>();
		l2.add(new ArrayList<>(Arrays.asList(1,2,3)));
		l2.add(new ArrayList<>(Arrays.asList(5,6,7)));
		System.out.println("flatemap");
		l.stream().flatMap(i->Stream.of(i*2)).forEach(System.out::println);
		//System.out.println("flatemap"+f);
		Optional<Integer> a=l.stream().reduce((i,j)->i+j);
		System.out.println("a"+a);
		
		

		
		List<Integer> k=l.stream().filter(p->p>5).collect(Collectors.toList());
		System.out.println("filter"+k);
		
		System.out.println("sort");
		
		l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		List<Integer> s=l.stream().map(p->p*2).collect(Collectors.toList());
		System.out.println("map"+s);
		
		Optional<Integer> s2=l.stream().max(Integer::compare);
		
		System.out.println("max"+s2);
		
		
		//Creating the stream in java
		
		//1> using collection
		l.stream().forEach(System.out::println);
		
		//2>using Steam.of()
		Stream.of(1,2,3,5).forEach(System.out::println);
		Stream.of('a','b','c').forEach(System.out::println);
		
		//3>Arrays as stream 
		Integer[] a1=new Integer[] {1,2,3};
		Stream.of(a1).forEach(System.out::println);
		
		//Arrays.stream(a1).forEach(System.out::println);
		//System.out.println(a1);
		Stream<Integer> s3=Arrays.stream(a1);
		s3.forEach(m->System.out.println(m));
		
		Stream<String> s5=Arrays.stream("b,c,d".split(","));
		s5.forEach(m->System.out.println(m));
	     //stream builder
		Stream.Builder<String> bu =Stream.builder();
		Stream<String> s6 = bu.add("a").add("b").build();
		s6.forEach(m->System.out.println(m));
		
		
		
		
		
		
		
		
	}

}
