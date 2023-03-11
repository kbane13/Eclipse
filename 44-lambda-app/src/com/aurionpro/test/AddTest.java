package com.aurionpro.test;

import com.aurionpro.model.AddInteger;
import com.aurionpro.model.IAddable;

public class AddTest {

	public static void main(String[] args) {
//		IAddable obj = new AddInteger();
//		System.out.println(obj.add(10, 20));
//Anonymous class
//		IAddable obj2=new IAddable() {
//
//			@Override
//			public int add(int a, int b) {
//				// TODO Auto-generated method stub
//				return a+b;
//			}
//			
//		};
//		System.out.println(obj2.add(20, 40));
		
		
//			IAddable obj2=(x,y)-> x+y;
//			
//			
//		
//		System.out.println(obj2.add(40, 40));
		IAddable addObj=AddTest::numberAddition;
System.out.println((addObj.add(20, 30)));
	}
	
	public static int numberAddition(int a,int b) {
		return a+b;
	}

}
