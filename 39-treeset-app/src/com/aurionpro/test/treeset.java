package com.aurionpro.test;

import java.util.Set;
import java.util.TreeSet;

public class treeset {
	
	public static void main(String[] args)
    {
        // Creating a Set interface with reference to
        // TreeSet
        Set<String> ts1 = new TreeSet<>();
  

        ts1.add("A");
        ts1.add("B");
        ts1.add("C");
  // Duplicates will not get insert
        ts1.add("C");
  
        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);
        
        System.out.println("First Value " + ((TreeSet<String>) ts1).first());
        
        // Print the last element in
        // the TreeSet
        System.out.println("Last Value " + ((TreeSet<String>) ts1).last());
        
        
        String check = "G";
        
        // Check if the above string exists in
        // the treeset or not
        System.out.println("Contains " + check + " "
                           + ts1.contains(check));
    }

}
