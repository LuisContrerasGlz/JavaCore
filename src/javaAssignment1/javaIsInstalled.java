package javaAssignment1;

import java.util.Scanner;
// Write a Java program to check whether Java is installed on your computer
public class javaIsInstalled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char vowel;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any character");
		vowel=s.next().charAt(0);
		System.out.println("Java Version:"+System.getProperty("java.version"));
		s.close();

	}

}
