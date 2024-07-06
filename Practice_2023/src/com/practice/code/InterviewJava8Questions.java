package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewJava8Questions {

	
	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>(Arrays.asList(5,6,9,2,9));
		List<Integer> list2= new ArrayList<>(Arrays.asList(6,2,7));
		List<String> listStr= new ArrayList<>(Arrays.asList("bbb","a","zzzzzz","ee"));
		
		int[] a =new int[] {4,1,6,7,7};
		int[] b = new int[] {3,2,5,8,8};
		
		
		String s="suma is good girl";
		
		// separate the even and odd
		Map<Boolean,List<Integer>> l=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(l);
		
		
		// find the frequency of each character in the string
		Map<Object,Long> m=s.chars().mapToObj(c->c).collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		
		//sort  the list in the reverse order
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//print the multiplses of 5 
		list.stream().filter(i->i%5==0).forEach(System.out::println);
		
		
		// merge 2 unsorted array into 1 sorted array	
		IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().forEach(System.out::println);
		
		// merge 2 unsorted array into 1 sorted array
		int[] array= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
		for(int a1 : array)
		{
			System.out.println("array"+a1);
		}
		//3 max and min from the list
		System.out.println("3 min   from the list");
		list.stream().sorted().limit(3).forEach(System.out::println);
		
		System.out.println("3 max   from the list");
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		//sort the lists of string in increasing order based on the lenth()
		
		listStr.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
		
		System.out.println(list.stream().mapToInt(e->e).average().getAsDouble());
		
		System.out.println(list.stream().count());
		
		// find last element of an array 	
		System.out.println(list.stream().skip(list.size()-1).findFirst());
		
		// Remove the duplicates elements from the list
		list.stream().distinct().forEach(System.out::println);
		
		
		// frequecy of each element in the list
		Map<Integer,Long>m1=list.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		System.out.println(m1);
		
		
		//find maxium and minium in the list
		
		System.out.println(list.stream().max(Comparator.naturalOrder()).get());
		
		
		// find the minium in the list
		
		System.out.println(list.stream().min(Comparator.naturalOrder()).get());
		 
		/// find the second largest elemement in the array
		
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
		
		
		// find the common elements in the  in 2 list
		list.stream().filter(e->list2.contains(e)).forEach(System.out::println);
		
		
		// finf the duplicated elements in he list
		
		Set<Integer> set= new HashSet<>();
		
		list.stream().filter(p->!set.add(p)).forEach(System.out::println);
		
		
		// find the string that starts with the number;
		List<String> ls= new ArrayList<>(Arrays.asList("suma","4auma"));
		
		ls.stream().filter(i->Character.isDigit(i.charAt(0))).forEach(System.out::println);
		
		// find the sumof n naural number
		System.out.println(IntStream.range(1, 11).sum());
		
		
		// to check the anagram or not
		String s3="suma";
		String s4="amus";
	    String s5=Stream.of(s3.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
	   String s6= Stream.of(s4.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if(s5.equals(s6)) {
			System.out.println("anagram");
		}
		// reverse the each word in in the string:
		
		String s9=Stream.of(s.split(" ")).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(s9);
		
		Stream.iterate(new int[] { 0,1}, f-> new int[] {f[1],f[0]+f[1]}).limit(10).map(f->f[0]).forEach(System.out::println);
		
		
		
		
	
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
