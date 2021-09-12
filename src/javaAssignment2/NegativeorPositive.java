package javaAssignment2;

import java.util.Scanner;


//Write a Program to check  whether  number is positive or negative number

public class NegativeorPositive {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number to check if it is positive or negative: ");
		num=s.nextInt();
		
		if (num < 0) {
			System.out.print("Number is negative ");
		}
		else {
			System.out.print("Number is positive ");
		}
		s.close();

	}

}
