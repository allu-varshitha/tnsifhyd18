package twodimensional;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student[] arr;
  arr=new Student[5];
  arr[0]=new Student(1,"varshu");
  arr[1]=new Student(2,"Kiran");
  for(int i=0;i<arr.length;i++) {
	  System.out.println(arr[i].rollno+" "+arr[i].name);
  }
	}

}
