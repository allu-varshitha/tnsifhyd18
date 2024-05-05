package day4;

public class cardefault {
	int num;
	public cardefault(){
 	   System.out.println("constructor called");
 	   num=6;
 	   
 	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       cardefault c1=new cardefault();
       System.out.println(c1.num);
       
       }

}
