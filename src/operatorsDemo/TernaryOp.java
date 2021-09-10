package operatorsDemo;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,res;
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter value of num1");
		num1=s.nextInt();
		
		System.out.println("Enter value of num2");
		num2=s.nextInt();
		
		res=(num1>num2)?num1:num2;//Ternary Operator
		System.out.println("Greatest no is:"+res);
		s.close();
	}

}
