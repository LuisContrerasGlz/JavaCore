package OOPS;

import java.util.Scanner;

public class ConstructorDemo {
	float radius;
	int res;
	final float pie=3.14f;
	public ConstructorDemo()//Default constructor 
	{
		radius=12.2f;
		
	}
	public ConstructorDemo(int num1,int num2)//Parameterized Constructor
	{
		if(num1>num2)
		{
			System.out.println("Num1 is greater"+num1);
		}
		else
		{
			System.out.println("Num2 is greater"+num2);
		}
	}
	public void test()
	{
		System.out.println(radius);
	}
	public void demo()
	{
		System.out.println(radius);
	}
	public void demo(int num1)
	{
		System.out.println(num1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		ConstructorDemo oo=new ConstructorDemo();//Call default Constructor
		oo.test();
		oo.demo();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for num1");
		n1=s.nextInt();
		
		System.out.println("Enter value for num2");
		n2=s.nextInt();
		ConstructorDemo obj=new ConstructorDemo(n1,n2);//Call Parameterized Constructor
	}

}
