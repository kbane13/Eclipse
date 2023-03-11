package com.aurionpro.test;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		//LinkedList<Integer>l1=new LinkedList();
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add("krutika");
		l1.add("Komal");
		l1.add(2,"Sheetal");
		l1.add(20);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		l1.remove(2);  //remove
		l1.set(1, "Sakshi");//changing element
       System.out.println(l1);
       Object[] a = l1.toArray();
       System.out.print("After converted LinkedList to Array: ");
       for(Object element : a)
       System.out.print(element+" ");
       //l1.addFirst(80);
       l1.listIterator(2);
       System.out.println("After iterator:"+l1);
       l1.addLast(2);//adds the element in the last
       l1.poll();//remove the first element
       l1.size();//returns the size
       System.out.println(l1.toString());//returns an string containing all of the elements in this list 
       System.out.println(l1);
	}

}
