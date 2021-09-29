package javaAssignment3;

// WAP to find the largest and smallest  element of and array
public class Find_Largest_Smallest {

	public static void main(String[] args) {
		
		int exampleArray[] = {10,20,30,40,50,60,70,80,90,100};
		
		int smallest  = exampleArray[0];
		int largest  = exampleArray[0];
		
		for (int i = 0; i < exampleArray.length; i++) {
			
			if(exampleArray[i] < smallest) {
				smallest = exampleArray[i];
			}
			
			if(exampleArray[i] > largest) {
				largest = exampleArray[i];
			}
			
		} 
		
		System.out.print("The smallest value in the array is: " + smallest + " and " + "the largest value in the array is: " + largest);

	}

}
