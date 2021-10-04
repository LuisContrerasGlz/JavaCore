package ExceptionHandling;


import java.util.Scanner;


public class ArithmeticDemo {
	int num1, num2, res;
	Scanner s = new Scanner(System.in);

	public void input() {
		Scanner s = new Scanner(System.in);
		try
		{
		System.out.println("Enter value for Num1");
		num1=s.nextInt();
		
		System.out.println("Enter value for Num2");
		num2=s.nextInt();
		
		res=num1/num2;
		System.out.println("Result is:"+res);
		}
		catch(java.util.InputMismatchException e1)
		{
			System.out.println("Enter only numeric value");
			System.out.println("Enter value for Num1");
			s.next();
			num1=s.nextInt();
			
			System.out.println("Enter value for Num2");
			num2=s.nextInt();
			
			res=num1/num2;
			System.out.println("Result is:"+res);
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("Enter num2 value again");
			
			System.out.println("Enter value for Num2");
			num2=s.nextInt();
			
			res=num1/num2;
			System.out.println("Result is:"+res);
		}
		finally 
		{
			
			s.close();
			System.out.println("Done successfully!!!");
		}

	}

	public static void main(String[] args) {
		
		ArithmeticDemo oo=new ArithmeticDemo();
		oo.input();
	}

}
