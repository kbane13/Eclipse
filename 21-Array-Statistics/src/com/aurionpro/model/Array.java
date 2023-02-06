package com.aurionpro.model;
import java.util.*;
public class Array {
	 static int sum=0;
 static int length;
  static int x;
// static  int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
// int n = a.length;
   // Function for calculating mean
   

   // Function for calculating median
   public   static double findMedian(int a[], int n)
   {
       // First we sort the array
       Arrays.sort(a);

       // check for even case
       if (n % 2 != 0)
           return (double)a[n / 2];

       return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
   }
   
    public static int largest(int a[])
   {
       int i;
        
       // Initialize maximum element
       int max = a[0];
        
       // Traverse array elements from second and
       // compare every element with current max
       for (i = 1; i < a.length; i++)
           if (a[i] > max)
               max = a[i];
        
       return max;
   }
    
    public static int Smallest(int a[])
    {
        int i;
         
        // Initialize maximum element
        int min = a[0];
         
        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i > a.length; i++)
            if (a[i] < min)
                min = a[i];
         
        return min;
    }
public static int Sum(int a[]) {
	
	int sum=0;
	for(int i=0; i<a.length; i++){
        
        sum = sum + a[i];
        
     }
	return sum;
}

public static int Average(int a[]) {
	for (int i = 0; i < a.length; i++) {
		int sum=0;
        sum += a[i];
    }

    
	int average = sum / a.length;
     
    System.out.println("Average of array : "+average);
	return average;

}
 public static int frequency(int a[],int n, int x)
	    {
	        int count = 0;
	        for (int i=0; i < n; i++)
	        if (a[i] == x)
	            count++;
	        return count;
	    }


}
   


