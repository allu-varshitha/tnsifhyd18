// accessing instance members
package com.si.test;

public class sample {
       int a=10;
      
       static int c=30;
       void callme()
       {
    	System.out.println("the value of a "+a);// can access both instance and static variables in instance methods
    	System.out.println("the value of c "+c);
       }
    	   
    public static void main(String[] args) {
       // TODO Auto-generated method stub
    	sample s=new sample();
    		   System.out.println(s.a);
    		   s.callme();
              System.out.println(sample.c);
              
    }
}
