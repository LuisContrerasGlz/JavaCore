package javaAssignment1;

import java.util.Scanner;

public class div2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for Num1");
		num1=s.nextInt();
		System.out.println("Enter any value for Num2");
		num2=s.nextInt();
		res = num1/num2;
		System.out.println("The div of the 2 numbers is " + res);
		s.close();
	}

}
