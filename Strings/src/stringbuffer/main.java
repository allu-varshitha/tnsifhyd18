package stringbuffer;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuffer sb=new StringBuffer("hello");
 // sb.append(" java");
  //sb.insert(2, "java");
  // sb.replace(1,3,"java");
   sb.delete(1, 3);
   System.out.println(sb);
	}

}
