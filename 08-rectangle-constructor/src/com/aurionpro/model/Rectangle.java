package com.aurionpro.model;

public class Rectangle {
	private int width;
	private int height;
 private Color color;
	public Rectangle(int width, int height,Color color) {
		this.width = width;
		this.height = height;
		this.color=color;
	}
	public Rectangle(int width,int height){
		this(width,height,Color.blue);
	}

	public Rectangle() {
		this(10,30,Color.purple);
	}

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public double CalculateArea() {
		return height * width;
	}

}
