package map;
import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer, String> hm
        = new HashMap<Integer, String>();

    hm.put(1, "Geeks");
    hm.put(2, "For");
    hm.put(3, "Geeks");
    System.out.println("Value for 1 is " + hm.get(1));
    
    for (Map.Entry<Integer, String> e : hm.entrySet())
        System.out.println(e.getKey() + " " + e.getValue());


    
    
    
    
	}

}
