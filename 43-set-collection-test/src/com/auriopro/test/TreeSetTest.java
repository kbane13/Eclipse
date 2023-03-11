package com.auriopro.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("c");// duplicates not get inserted
		System.out.println(ts);
		System.out.println(ts.contains("a"));// checks the string exists or not
//checks the first and last value
		System.out.println("First Value " + ((TreeSet) ts).first());
		System.out.println("last Value " + ((TreeSet) ts).last());
//higher and lower string value
		System.out.println("Higher " + ((TreeSet) ts).higher("b"));
		System.out.println("Lower " + ((TreeSet) ts).lower("b"));
//	ts.remove("c");
//	System.out.println("after removing:"+ts);
		((TreeSet) ts).pollLast();// remove last element
		System.out.println(ts);
		Iterator i = ts.iterator();
		System.out.println("Iterator");
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		for (String value : ts)

			// Printing the values inside the object
			System.out.print(value + ", ");

		System.out.println();

	}
}
