package com.aurionpro.model;

public class Rectangle implements Shape {
	double height;
	double width;

	@Override
	public double calculateArea() {
		
		return height * width ;
	}

	public Rectangle(double height,double width) {
		super();
		this.height=height;
		this.width=width;
	}

	@Override
	public void showColor() {
		System.out.println("BLue COlor");
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

}
