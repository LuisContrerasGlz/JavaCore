package javaAssignment2;

import java.util.Scanner;

// WAP to check whether a number is even or odd.
public class EvenOrOdd {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number to check if it is even or odd: ");
		num=s.nextInt();
		
		if (num % 2 == 0) {
			System.out.print("Number is even ");
		}
		else {
			System.out.print("Number is odd ");
		}
		s.close();

	}

}
