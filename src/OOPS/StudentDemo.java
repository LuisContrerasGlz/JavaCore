package OOPS;

import java.util.Scanner;

public class StudentDemo {
static int rollno;
 String name;
 int age;
 Scanner s=new Scanner(System.in);
static
{
	rollno=1;
	System.out.println("Rollno is:"+rollno);
	
}
public void inputdata()
{
	System.out.println("RollNo value is:"+rollno);
	System.out.println("Enter Name");
	name=s.next();
	
	System.out.println("Enter Age");
	age=s.nextInt();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
