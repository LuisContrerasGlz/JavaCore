package javaAssignment1;

import java.util.Scanner;

public class areaAndPerimeterCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area,per,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any value for radio");
		r=s.nextInt();
		area = (int) (3.14 *r*r);
		per = (int) (2*3.14*r);
		System.out.println("The area of this circle is  " + area);
		System.out.println("The perimeter of this circle is  " + per);
		s.close();
	}

}
