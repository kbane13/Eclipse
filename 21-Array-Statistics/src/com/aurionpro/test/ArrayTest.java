package com.aurionpro.test;

import com.aurionpro.model.Array;

public class ArrayTest {

	public static void main(String[] args) {
		Array arr=new Array();
        int a[] = { 1, 3, 4, 2, 7, 5, 8, 6,1};
        int n = a.length; 
       
   
        
        System.out.println("Median = " + arr.findMedian(a, n));
        System.out.println("Max"+arr.largest(a));
        System.out.println("Min"+arr.Smallest(a));
        System.out.println("Sum"+arr.Smallest(a));
        System.out.println("average"+arr.Average(a));
      
		System.out.println("Frequency"+Array.frequency(a,n,1));
    }
}
