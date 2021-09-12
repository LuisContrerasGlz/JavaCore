package javaAssignment2;

import java.util.Scanner;

// Write a Java program to compare two numbers.
public class Compare2Num {

	public static void main(String[] args) {
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for Num1");
		num1=s.nextInt();
		System.out.println("Enter any value for Num2");
		num2=s.nextInt();
		
		if(num1 > num2)
		{
		System.out.println(num1 + " is greater than " + num2);
		}
		else if(num1 < num2)
		{
		System.out.println(num1 + " is less than " + num2);
		}
		else
		{
		System.out.println(num1 + " is equal to " + num2);
		}
		
		 s.close();
		}

		
	}

