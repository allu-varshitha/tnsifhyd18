package prioritythreads;

public class class1 extends Thread {
 public void run() {
	 
	System.out.println("running thread name is:"+Thread.currentThread().getName());  
	System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	  

 }
}
 
