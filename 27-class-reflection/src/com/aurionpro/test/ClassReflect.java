package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


class ClassReflect {

 
 public static void main(String args[]) throws Exception
 {
     
     Reflection obj = new Reflection();

   
     Class cls = obj.getClass();

   
     System.out.println("Class Name is "
                        + cls.getName());

     
     Constructor constructor = cls.getConstructor();

     System.out.println("Constructor name is "
                        + constructor.getName());

    
     System.out.println(
         "The public methods of class are : ");

     
     Method[] methods = cls.getMethods();

     
     for (Method method : methods)
         System.out.println(method.getName());

     
     
     Method methodcall1
         = cls.getDeclaredMethod("method2", int.class);

   
     methodcall1.invoke(obj, 07);

	     
     Field field = cls.getDeclaredField("s");

     		
     field.setAccessible(true);

     field.set(obj, "Hello");

     
     Method methodcall2
         = cls.getDeclaredMethod("method1");


     methodcall2.invoke(obj);

     
     Method methodcall3
         = cls.getDeclaredMethod("method3");

     methodcall3.setAccessible(true);

     
     methodcall3.invoke(obj);
 }
}