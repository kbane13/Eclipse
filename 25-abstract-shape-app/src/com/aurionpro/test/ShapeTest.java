package com.aurionpro.test;

import com.aurionpro.model.Circle;
import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class ShapeTest {

	public static void main(String[] args) {
	 Circle c=new Circle(Color.red,3);
	 System.out.println("area of circle:"+c.calculateArea());
	
     
	 Rectangle r =new Rectangle(Color.blue,20,30);
	 System.out.println("area of rectangle:"+r.calculateArea());

	}
}