package com.aurionpro.model;

 public class Rectangle {
	private int height;
	private int width;
	private Color color;
	public void setHeight(int height) {
		this.height=CorrectedValues(height);
		
	}
	private int CorrectedValues(int num) {
		if(height>100 ) {
			this.height=100;
		}
		 if(height<1)
		{
			this.height=1;
		}
		return num;
	}
	public void setwidth(int width) {
	
		
		this.width=100;
		
	}
	public int getHeight() {
		return height;
	}
	public int getwidth() {
		return width;
	}
	
	



}

