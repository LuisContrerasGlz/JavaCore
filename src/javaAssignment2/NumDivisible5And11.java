package javaAssignment2;

import java.util.Scanner;

// Check whether a number is divisible by 5 and 11
public class NumDivisible5And11 {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number to check if it is divisible by 5 and 11: ");
		num=s.nextInt();
		
		if((num % 5 == 0) && (num % 11 == 0))
		{
			System.out.println("Number is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println("Number is Not Divisible by 5 and 11"); 
		}	
		s.close(); 
	}

}
