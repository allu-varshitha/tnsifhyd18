package Queue;
import java.util.*;
public class dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayDeque<Integer> d
        = new ArrayDeque<Integer>(10);
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        System.out.println(d);
        d.clear();
        d.addLast(24);
        d.addLast(14);
  
        System.out.println(d);

        
        
        

	}

}
