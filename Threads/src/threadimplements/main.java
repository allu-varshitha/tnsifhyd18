package threadimplements;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  employee1 e1=new employee1();
  Thread t1=new Thread(e1);
  t1.start();
	}

}
