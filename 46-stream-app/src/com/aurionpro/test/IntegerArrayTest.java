package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class IntegerArrayTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 45);
		List<Integer> list1 = Arrays.asList(10, 20, 30, 40);
		list.stream().max(Comparator.comparing(n -> n)).ifPresent(System.out::println);
		list.stream().min(Comparator.comparing(n -> n)).ifPresent(System.out::println);
//		int sum = list1.stream().reduce(0,
//                (element1, element2) -> element1 + element2);//assigns  binary operator
		// System.out.println(sum);
//		Optional<Integer> result = list1.stream().findFirst();
//		System.out.println(result);
//		 Optional<Integer> answer = list1.stream().findAny();
//System.out.println(answer);

	}

}
