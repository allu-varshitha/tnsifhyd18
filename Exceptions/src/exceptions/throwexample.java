package exceptions;

public class throwexample {
	static void validate(int age) {
		if(age<18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          validate(21);
          System.out.println("rest of the code");
	}

}
