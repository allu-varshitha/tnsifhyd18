package exceptions;

public class multiplecatchs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int a[]=new int[5];
        	a[5]=30/0;
        }
        catch(ArithmeticException e) {
        	System.out.println(" arthmetic exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("array index out of bounds exception occurrs");
        }
        catch(Exception e) {
        	System.out.println("rest of the code");
        }
	}

}
