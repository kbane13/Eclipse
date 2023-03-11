package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 4, 2, 30, 19, 40, 50);
//		Collections.sort(list, Collections.reverseOrder());
		List<Integer> sortedList = list.stream()
				.filter(n->n%2==0)
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList);

//		java.util.List<String> strList = Arrays.asList("Krutika", "Rasika", "Sheetal");
//		Collections.sort(strList, Collections.reverseOrder());
//		System.out.println(strList);

	}

}
