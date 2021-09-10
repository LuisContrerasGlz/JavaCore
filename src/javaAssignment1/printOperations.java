package javaAssignment1;

import java.util.Scanner;

public class printOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,resSum,resSubs,resMult,resDiv,resRem;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for Num1");
		num1=s.nextInt();
		System.out.println("Enter any value for Num2");
		num2=s.nextInt();
		resSum = num1 +num2;
		resSubs = num1 -num2;
		resMult = num1 *num2;
		resDiv = num1 /num2;
		resRem = num1 %num2;
		System.out.println("The sum of the 2 numbers is " + resSum);
		System.out.println("The subs of the 2 numbers is " + resSubs);
		System.out.println("The Mult of the 2 numbers is " + resMult);
		System.out.println("The Div of the 2 numbers is " + resDiv);
		System.out.println("The Rem of the 2 numbers is " + resRem);
		s.close();

	}

}
