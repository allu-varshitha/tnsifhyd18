package multithreading;

public class multithread extends Thread{
	public void run() {
		try {

            for(int i=0;i<5;i++){

			System.out.println("Thread "+Thread.currentThread().getId()+" running");
		}
		}
		catch(Exception e) {
			System.out.println("exception caught");
		}
	}

}
