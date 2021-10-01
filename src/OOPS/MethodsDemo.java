package OOPS;

import java.util.Scanner;

public class MethodsDemo {
	int res,num1,num2;
	Scanner s=new Scanner(System.in);
//public int add(int num1,int num2)// Taking Something and Returning Something
//{
//	return num1+num2;
//	//return res;
//	
//}
	public void add(int num1,int num2)//Taking something returning Nothing
	{
		res=num1+num2;
		System.out.println("Result is:"+res);
	}
	
	//Taking Nothing and Returning Something
	public int add()
	{
		System.out.println("Enter any num1");
		num1=s.nextInt();
		
		System.out.println("Enter any num2");
		num2=s.nextInt();
		
		return num1+num2;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo obj=new MethodsDemo();
		obj.add(100, 200);
		//System.out.println(obj.add(100, 200));
		System.out.println(obj.add());
	}

}
