package Unboxing;

public class main {
public static void main(String[] args) {
	Integer aObj=Integer.valueOf(25);
	Double bObj=Double.valueOf(5.55);
	
	int a=aObj.intValue();
	double b=bObj.doubleValue();
	System.out.println("the value of a:"+a);
	System.out.println("the value of b:"+b);
}
}
