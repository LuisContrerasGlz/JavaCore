package javaAssignment3;

// WAP to find the index number of largest element
public class Index_largest_element {

	public static void main(String[] args) {
	
		int exampleArray[] = {10,20,30,40,50,60,70,80,90,100};
		
		int largest  = exampleArray[0];
		int index = 0;
		
		for (int i = 0; i < exampleArray.length; i++) {
				
			if(exampleArray[i] > largest) {
				largest = exampleArray[i];
				index = i;
			}
			
		}
		System.out.print("The largest value in the array is: " + largest +  " At index: " + index);
			
	}

}
