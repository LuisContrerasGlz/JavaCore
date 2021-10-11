package java_Practice_Code;

import java.util.Scanner;

/* Write a program which asks the user for a password. 
 * Make the password “shark50”. Each time the user enters the password incorrectly, prompt them for a password again. 
 * When the user enters the password correctly, print “ACCESS APPROVED”. 
 */
public class Password {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;
		 
		do {
		    System.out.print("Enter Password: ");
		    input = scanner.next();
		} while (!input.equals("shark50"));
		 
		System.out.println("ACCESS APPROVED");

	}

}
