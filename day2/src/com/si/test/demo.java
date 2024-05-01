// accessing static members
package com.si.test;

public class demo {
	 int a=10;
     
     static int c=30;
    static  void callme()
     {
  	System.out.println("the value of a "+a);// cannot access the instances variables in static method
  	System.out.println("the value of c "+c);
     }
  	   
}
