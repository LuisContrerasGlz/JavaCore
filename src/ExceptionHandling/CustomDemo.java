package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomDemo {
	int age;
	Scanner s=new Scanner(System.in);
	public void input() throws InvalidAgeException,ArithmeticException,InputMismatchException
	{
		System.out.println("Enter age");
		age=s.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException();
		}
		else
		{
			System.out.println("You have right to vote");
		}
	}
	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		CustomDemo oo=new CustomDemo();
		oo.input();
	}

}
