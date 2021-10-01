package OOPS;

import java.util.Scanner;

import InheritanceDemo.EmployeePerDetails;

//import InheritanceDemo.EmployeePerDetails;

public class EmpDemo {
	int a;
	float b;
	char c;
	long empid, contactno;
	String name, qual,e;
	boolean d;
	Scanner s=new Scanner(System.in);
	EmployeePerDetails oo=new EmployeePerDetails();
	public void personaldetails()
	{
		oo.display();
		oo.input();
		
		System.out.println("Enter Employee Id");
		empid=s.nextLong();
		
		System.out.println("Enter Name");
		name=s.next();
		
		System.out.println("Enter Contact No");
		contactno=s.nextLong();
		
		System.out.println("Enter Qualification");
		qual=s.next();
	}
	public void display()
	{
		System.out.println("Name is:"+name);
		System.out.println("Employee id is:"+empid);
		System.out.println("Contact No is:"+contactno);
		System.out.println("Qualification is:"+qual);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDemo obj=new EmpDemo();//Created an object of the class
		obj.personaldetails();//Calling Methods
		obj.display();
		System.out.println(obj.a);//Instance Variable
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
	}

}
