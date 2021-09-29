package javaAssignment3;

import java.util.Scanner;

// WAP to Search an Element from an array
public class Search_Element_Array {

	public static void main(String[] args) {
			
		int[] exampleArray = {10,20,30,40,50,60,70,80,90,100};
		int num;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number to check if it is in the Array: ");
		num=s.nextInt();
		
		for (int i = 0; i < exampleArray.length; i++) {
			if (exampleArray[i] == num) {
				System.out.println("The Element is in the Array!");
				break;
			} 
		}
		s.close(); 
	}

}
