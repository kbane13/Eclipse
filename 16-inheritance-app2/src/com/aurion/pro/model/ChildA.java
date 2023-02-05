package com.aurion.pro.model;

public class ChildA extends Parent {
  public ChildA(){
	  super("\n Hello");//calling parent class explicitly
	
	  System.out.println("I am child class");
	  System.out.println("byee byeeeeeeee");
}
  //static block cannot be overloaded
  static {
	  System.out.println("I am Static(Child)");
  }

}


