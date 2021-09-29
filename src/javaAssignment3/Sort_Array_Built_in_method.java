package javaAssignment3;

import java.util.Arrays;

//WAP to sort an array using built in method and display the elements using  foreach  loop.
public class Sort_Array_Built_in_method {

	public static void main(String[] args) {
	    
		int a[] = {10,50,80,5,2,90};
		
		System.out.println("The array elements without sorting are: " + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("The array elements sorted are: " + Arrays.toString(a));

	}

}
