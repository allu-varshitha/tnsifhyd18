package prioritythreads;

public class main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		class1 m1=new class1();  
		  class1 m2=new class1();  
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m1.start();  
		  m2.start();  

		
		
	}

}
