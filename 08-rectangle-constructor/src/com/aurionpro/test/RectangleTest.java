package com.aurionpro.test;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		printRectangleDetails(rectangle);
		Rectangle rectangle2=new Rectangle(20,30);
		printRectangleDetails(rectangle2);
		Rectangle rectangle3=new Rectangle(20,30,Color.purple);
		printRectangleDetails(rectangle3);

	}

	private static void printRectangleDetails(Rectangle rectangle) {
		System.out.println("width of rectangle is :" + rectangle.getWidth());
		System.out.println("height of rectangle is :" + rectangle.getHeight());
		System.out.println("Area of rectangle is :" + rectangle.CalculateArea());
        System.out.println("Color is :" +rectangle.getColor());
	}

}
