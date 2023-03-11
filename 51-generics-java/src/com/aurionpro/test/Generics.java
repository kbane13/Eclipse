package com.aurionpro.test;

class Generics<A, B>
{
    A obj1;  // An object of type T
    B obj2;  // An object of type U
  
    // constructor
   Generics(A obj1, B obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
  

    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
