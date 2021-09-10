
package operatorsDemo;
import java.util.Scanner;


public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num1=10,num2=100,sum;
		sum=num1+num2;
		System.out.println("Addition of 2 numbers is:"+sum);*/
		int num1,num2,sum,sub;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for Num1");
		num1=s.nextInt();
		
		System.out.println("Enter any value for Num2");
		num2=s.nextInt();
		
		sum=num1+num2;
		System.out.println("Sum of 2 numbers:"+sum);
		
		sub=num1-num2;
		System.out.println("Subtraction Result:"+sub);
		
		System.out.println("Multiplication Result:"+num1*num2);
		System.out.println("Divsion Result:"+num1/num2);
		System.out.println("Remainder value is"+num1%num2);
		s.close();
		
		}

}


//Package--Combination of classes,methods,Interfaces,Abstract classes
//1. Predefined   --import 
//2. User defined --package 
//Write a Programme to check whether the entered number is even or odd number