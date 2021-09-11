package javaAssignment1;

import java.util.Scanner;

/* Write a Java program to print the sum of two numbers.*/
public class sum2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for Num1");
		num1=s.nextInt();
		System.out.println("Enter any value for Num2");
		num2=s.nextInt();
		res = num2 +num1;
		System.out.println("The sum of the 2 numbers is " + res);
		s.close();
	}

}
