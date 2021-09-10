package conditional_Structure;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res,choice;
		Scanner s=new Scanner(System.in);
		System.out.print("1. Add\t\t2.Subtract\n3.Multiply\t4. Divide\n");
		
		System.out.println("Enter first No");
		num1=s.nextInt();
		
		System.out.println("Enter second No");
		num2=s.nextInt();
		
		System.out.println("Enter your Choice(1-4)");
		choice=s.nextInt();
		
		switch(choice)
		{
		case 1:
			res=num1+num2;
			System.out.println("Addition of 2 numbers:"+res);
			break;
			
		case 2:
			res=num1-num2;
			System.out.println("Subtract of 2 numbers:"+res);
			break;
			
		case 3:
			res=num1*num2;
			System.out.println("Multiplication result is:"+res);
			break;
			
		case 4:
			res=num1/num2;
			System.out.println("Division Result is:"+res);
			break;
			
		default:
			System.out.println("You have entered the wrong choice");
			break;
		}
		s.close();
		
		
		
	}

}
//Escape Characters
//\n==New Line     \t=tab   \a=alert
//output:
//1. Add       2. Subtract
//3. Multiply  4. Divide
//
//Enter value in 2 numbers
//21
//33
//Enter your Choice(1-4)
//2
//
//Subtraction Result is:-12
