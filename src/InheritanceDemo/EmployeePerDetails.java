package InheritanceDemo;

import java.util.Scanner;

public class EmployeePerDetails {
	String empid;
	String name;
	int age;
	String  qual;
	Scanner s=new Scanner(System.in);
	
	 void input()
	{
		System.out.println("Enter Employee Id");
		empid=s.next();
		
		System.out.println("Enter Name");
		name=s.next();
		
		System.out.println("Enter Age");
		age=s.nextInt();
		
		System.out.println("Enter Qualification");
		qual=s.next();
	}
	protected void display()
	{
		System.out.println("Employee id is:"+empid);
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		System.out.println("Qualification is:"+qual);

	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		EmployeePerDetails oo=new EmployeePerDetails();
//		oo.input();
//		oo.display();
//	}

}
