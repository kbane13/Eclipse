package com.aurionpro.test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
pq.add(10);
pq.add(20);
pq.add(50);
pq.add(30);
pq.add(40);

System.out.println(pq.peek());//printing top element
System.out.println(pq.poll());//removing top element
System.out.println(pq.peek());

Iterator iterator = pq.iterator();

while (iterator.hasNext()) {
    System.out.print(iterator.next() + " ");
}
System.out.println(pq.comparator());//used to order the elements in this queue
System.out.println(pq.hashCode());//hashcode value
System.out.println(pq.equals(5));//compares the object with collection
	}

	
}
