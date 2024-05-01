//Approach 1
package com.si.sample;

public class Test {
	int a=10;     //instance variable
	static int b=20;// static variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=30;
		System.out.println(c);//local variable
		Test t1=new Test();
		System.out.println(t1.a);
		System.out.println(Test.b);

	}

}
