package javaAssignment3;

import java.util.Arrays;
import java.util.Scanner;

// WAP to remove the element on specific index number form an array
public class Remove_Element_Specific_Index {

	public static void main(String[] args) {
		
		int exampleArray[] = {10,20,30,40,50,60,70,80,90,100};
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println(Arrays.toString(exampleArray));
		System.out.println("Enter a Number to delete from the array: ");
		num=s.nextInt();
		
		for (int i = 0; i < exampleArray.length; i++) {
			
			if(exampleArray[i] == num) {
				exampleArray[i] = exampleArray[i + 1];
				exampleArray[i + 1] = 0;
			}
			
		}
		
		System.out.println(Arrays.toString(exampleArray));
		s.close(); 
	}

}
