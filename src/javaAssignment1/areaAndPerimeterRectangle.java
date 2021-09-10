package javaAssignment1;

import java.util.Scanner;

public class areaAndPerimeterRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area,per,sidesA,sidesB;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for sidesA");
		sidesA=s.nextInt();
		System.out.println("Enter any value for sidesB");
		sidesB=s.nextInt();
		area = sidesA * sidesB;
		per = ((sidesA *2) + (sidesB *2));
		System.out.println("The area of this rectangle is  " + area);
		System.out.println("The perimeter of this rectangle is  " + per);
		s.close();
	}

}
