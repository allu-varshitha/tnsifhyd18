package threadextends;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e1=new Employee();
    e1.start();
    Manager m1=new Manager();
    m1.start();
    System.out.println(Thread.activeCount());
	}

}
