package com.aurionpro.test;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class NamesTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jayesh","Nimesh","Mahesh","Ramesh");
		names.stream().forEach(System.out::println);
		Arrays.asList(names).forEach(System.out::println);
		//ascending order 3 elements
		List<String> collect = names.stream().sorted().limit(2).collect(Collectors.toList());
		System.out.println("asc:"+collect);
		
		Collections.sort(collect, Collections.reverseOrder());
		System.out.println("desc"+collect);
		
      
     
   
		
	

	}

}
