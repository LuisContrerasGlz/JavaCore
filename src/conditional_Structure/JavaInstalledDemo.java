package conditional_Structure;

import java.util.Scanner;

public class JavaInstalledDemo {

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
