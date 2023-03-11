package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		System.out.println(list);

		for (Integer i : list) {
			System.out.println(i);
		}

//		System.out.println("for loop");
//		for(int i=0;i<=list.size();i++) {
//			System.out.println(list.get(i));
//		}

//		System.out.println("\nIterator");
//		Iterator<Integer> it=list.iterator();
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		}
		list.remove(new Integer(20));
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.isEmpty());
		System.out.println(list.subList(0, 2));
		System.out.println(list.containsAll(list));
//		list.clear();
//		System.out.println(list);
		// list.set(1, 90);
		list.toArray(); // It is also used to return an array containing all of the elements in this
						// list in the correct order same as the previous method.
		System.out.println(list);
	}

}
