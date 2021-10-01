package OOPS;

import java.util.Scanner;

public class StaticMethod {
	static String companyname;
	String emp_name;
	long contact_no;
	static int num;
	static Scanner s=new Scanner(System.in);
	public void input()
	{
		System.out.println("Employee Name");
		emp_name=s.next();
		
		System.out.println("Enter Contact No");
		contact_no=s.nextLong();
		
	}
	public static void test(int n)
	{
		num=n;
		//input();
		System.out.println("Enter Company Name");
		companyname=s.next();
		
	}
	public static void main(int a)
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod.test(10);//Static methods belongs to class 
		StaticMethod.main(10);
	}

}
