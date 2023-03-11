package com.auriopro.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("C");// will not add C as C already exists
		linkedset.add("D");
		linkedset.add("E");
//size
		System.out.println("Size of LinkedHashSet = " + linkedset.size());
		System.out.println("Original LinkedHashSet:" + linkedset);
//removing element
		System.out.println("Removing D from LinkedHashSet: " + linkedset.remove("D"));
		System.out.println("Checking if A is present=" + linkedset.contains("A"));// checking if A is present or not
		System.out.println("Updated LinkedHashSet: " + linkedset);

//iterating 
		Iterator itr = linkedset.iterator();

		while (itr.hasNext())
			System.out.print(itr.next() + ", ");

// New line
		System.out.println();

// Using enhanced for loop for iteration
		for (String s : linkedset)
			System.out.print(s + ", ");
		System.out.println();

	}

}
