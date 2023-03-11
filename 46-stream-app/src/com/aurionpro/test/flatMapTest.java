package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapTest {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(10, 20, 30);
		List<Integer> list2 = Arrays.asList(30, 20, 60);
		List<Integer> list3 = Arrays.asList(70, 80, 90);
		// list of list<Integer>
		List<List<Integer>> merge = new ArrayList<>();
		merge.add(list1);

		merge.add(list2);
		merge.add(list3);
		System.out.println(merge);
		// flat list
		List<Integer> flatList = new ArrayList<Integer>();
		for (List<Integer> l : merge) {
			for (Integer i : l) {
				if (!flatList.contains(i))
					flatList.add(i);
			}
		}
		System.out.println(flatList);
		// using stream
		List<Integer> collect = merge.stream().flatMap(list -> list.stream()).distinct().collect(Collectors.toList());// distinct():consist
																									// of
																														// distinct
																														// elements
		System.out.println(collect);
	}

}
