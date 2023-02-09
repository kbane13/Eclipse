package com.aurionpro.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
  

class Reflection {
    
    private String s;
  
    
    public Reflection() { s = "hello "; }
  
   
    public void method1()
    {
        System.out.println("The string is " + s);
    }
  
    public void method2(int n)
    {
        System.out.println("The number is " + n);
    }
  
    
    private void method3()
    {
        System.out.println("Private method invoked");
    }
}
  
