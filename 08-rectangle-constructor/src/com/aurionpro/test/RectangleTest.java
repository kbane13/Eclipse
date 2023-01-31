package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		printRectangleDetails(rectangle);
		

	}

	private static void printRectangleDetails(Rectangle rectangle) {
System.out.println("Default constructor");
		System.out.println("width of rectangle is :" + rectangle.getWidth());
		System.out.println("height of rectangle is :" + rectangle.getHeight());
		System.out.println("Area of rectangle is :" + rectangle.CalculateArea());
		
	}

}
