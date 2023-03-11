package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

public class LowerBound {
	
	public static void main(String[] args) 
	  {
	    List < Integer > int_List = Arrays.asList(3, 5, 7, 9);
	    printLowerBounded(int_List);
	    List < Number > number_List = Arrays.asList(10.5, 20.2, 30.3, 40.5);
	    printLowerBounded(number_List);
	  }
	  public static void printLowerBounded(List < ?super Integer > LowerBounded_list) 
	  {
	    System.out.println(LowerBounded_list);
	  }
	}


