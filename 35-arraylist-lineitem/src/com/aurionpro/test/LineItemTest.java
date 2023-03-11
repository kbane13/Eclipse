package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		List<LineItem>list=new ArrayList<>();
		LineItem line=new LineItem(1,"parleG",5,10);
	
		list.add(line);
		
		LineItem line2=new LineItem(2,"DairyMilk",6,10);
		
		list.add(line2);
		
		LineItem line3=new LineItem(3,"GoodDay",9,20);
		list.add(line3);
		double totalCartCost=0;
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			totalCartCost+=list.get(i).calculateCost();
		}
		
		System.out.println(totalCartCost);
        
		
		

	}

}
