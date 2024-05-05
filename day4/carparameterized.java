package day4;

public class carparameterized {
   int num;
   public carparameterized(int x) {
	   System.out.println("constructor called");
	   num=8;
   }
   public static void main(String[] args) {
	carparameterized c1=new carparameterized(4);
	System.out.println(c1.num);
}
}
