package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeTest {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();
		deque.add(1);
		deque.addFirst(0);
		deque.addLast(2);
		deque.offer(10);// to insert
		deque.offer(20);
		System.out.println(deque);
		System.out.println(deque.contains(3));
		for (Iterator itr = deque.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

		for (Iterator desc = deque.descendingIterator(); desc.hasNext();) {
			System.out.println("Descending order:" + desc.next());
		}
		System.out.println("\nHead element : " + deque.peek());

		System.out.println("Head element poll : " + deque.poll());

		// Display first element
		System.out.println("The first element is: " + deque.getFirst());

//Display last element
		System.out.println("The last element is: " + deque.getLast());
	}

}
