package java_Practice_Code;

import java.util.Scanner;

/* Write a program which asks the user to enter their top five favourite foods and store their answers in a string array. 
 * However, create the array so it can only hold a maximum of three strings. After the user enters the third item, 
 * print “No more memory available.”, then print out the contents of the array.
 * 
 *  For this program use scanner.nextLine() when grabbing input from the user. 
 *  This is because if the user enters a food such as “Ice cream” 
 *  then scanner.next() will interpret that as two separate strings, due to the space. 
 *  This may result in the program storing “Ice” as one the user’s favourite foods, and “cream” as another. 
 *  However, if you use scanner.nextLine(), it will return the entire line as a single string.
 */
public class Arrays_favourite_foods {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Enter your top five favourite foods.\n");
		 
		String[] foods = new String[3];
		for (int i = 0; i < foods.length; i++) {
		    System.out.print("Food " + (i + 1) + ": ");
		    foods[i] = scanner.nextLine();
		}
		System.out.println("No more memory available.\n");
		 
		System.out.println("Your favourite foods are: ");
		for (int i = 0; i < foods.length; i++) {
		    System.out.println(" - " + foods[i]);
		}

	}

}
