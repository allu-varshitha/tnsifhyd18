package Autoboxing;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=5;
  double b=5.6;
  Integer aObj=Integer.valueOf(a);
  Double bObj=Double.valueOf(b);
  if(aObj instanceof Integer) {
	  System.out.println("an object integer created");
  }
  if(bObj instanceof Double) {
	  System.out.println("an object double created");
  }
	}

}
