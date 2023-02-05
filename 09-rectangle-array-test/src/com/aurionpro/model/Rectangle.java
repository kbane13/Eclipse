package com.aurionpro.model;

public class Rectangle {
private double width;
private double height;
@Override
public String toString() {
	return "Rectangle [width=" + width + ", height=" + height + "]";
}
public Rectangle(double width,double height) {
	super();
	this.height=height;
	this.width=width;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double CalculateArea() {
return height*width;
}
}
