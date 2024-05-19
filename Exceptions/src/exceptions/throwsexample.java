package exceptions;
import java.io.IOException;
public class throwsexample {
    void m()throws IOException{
    	throw new IOException("error");
    }
    void n()throws IOException{
    	m();
    }
    void p() {
    	try {
    		n();
    	}
    	catch(Exception e) {
    		System.out.println("exception handled");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    throwsexample t1=new throwsexample();
    t1.p();
    System.out.println("normal flow");
	}

}
