package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {

	public static void main(String[] args) {
		List<Integer>numberList=Arrays.asList(10,22,30,44);
		System.out.println(numberList);
		List<Integer>divisiblebyTen=new ArrayList<Integer>();
		for(Integer x:numberList) {
			if(x%10==0) {
		
			divisiblebyTen.add(x);
		}
		

	}
		System.out.println(divisiblebyTen);
		
		//numberList.stream().filter(n->n%10==0).forEach(System.out::println);
//      List<Integer>collect=numberList.stream().filter(n->n%10==0).collect(Collectors.toList());
//	System.out.println(collect);
	
	List<String> friends = Arrays.asList("Krutika","Rasika","Komal","Sheetal","Riya");
	 List<String>collect=friends.stream().filter(n->n.length()>=5).collect(Collectors.toList());
		System.out.println(collect);
	
	}
}

