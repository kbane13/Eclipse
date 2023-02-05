package com.aurionpro.test;

import com.aurionpro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[5];
		for (int i = 0; i < 5; i++) {
			rectangles[i] = new Rectangle(10 + i, 20 + i);

		}
		for (Rectangle x : rectangles) {
			System.out.println(x);
			// printRectangle(x);

		}
	}
}

// private static void printRectangle(Rectangle x) {
// System.out.println("height is " +x.getHeight());
// System.out.println("width ");
