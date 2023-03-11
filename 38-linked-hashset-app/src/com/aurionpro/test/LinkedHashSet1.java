package com.aurionpro.test;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSet1 {
 
	 public static void main(String args[]){  
	 //Creating HashSet and adding elements  
	        LinkedHashSet<String> set=new LinkedHashSet();  
	               set.add("One");    
	               set.add("Two");    
	               set.add("Three");   
	               set.add("Four");  
	               set.add("Five");  
	               Iterator<String> i=set.iterator();  
	               while(i.hasNext())  
	               {  
	               System.out.println(i.next());  
	               }  
	               System.out.println(set.remove("One"));
	               System.out.println(set);
	 }  
	}  

