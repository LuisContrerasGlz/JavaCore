package conditional_Structure;

import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for Num1");
		num1=s.nextInt();
		
		if(num1%2==0)
		{
			System.out.println("Even No:"+num1);
		}
		else
		{
			System.out.println("Odd No:"+num1);
		}
		s.close();
	}

}
