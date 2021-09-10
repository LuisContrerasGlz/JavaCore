package javaAssignment1;

import java.util.Scanner;

public class averageOf3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,sumnum,aver;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for Num1");
		num1=s.nextInt();
		System.out.println("Enter any value for Num2");
		num2=s.nextInt();
		System.out.println("Enter any value for Num3");
		num3=s.nextInt();
		sumnum = num1 + num2 + num3;
		aver = sumnum/3;
		System.out.println("The average of the 3 numbers is " + aver);
		s.close();
	}

}
