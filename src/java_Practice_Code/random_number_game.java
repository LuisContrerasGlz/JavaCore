package java_Practice_Code;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/* Create a game where the program picks a random number from 1 to 5 and you, the player, has to guess it.

If the player guesses right, print “Correct! Aren’t you lucky.“.

If the player guesses wrong, print “Hard luck! Maybe next time.“.*/ 
public class random_number_game {

	public static void main(String[] args) {
		int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
		 
		System.out.println("I'm thinking of a number from 1 to 5. Try to guess it.");
		System.out.print("Your guess: ");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		 
		if (guess == randomNumber) {
		    System.out.println("Correct! Aren't you lucky.");
		}
		else {
		    System.out.println("Wrong! Have another go.");
		    System.out.print("Your guess: ");
		    guess = scanner.nextInt();
		 
		    if (guess == randomNumber) {
		        System.out.println("Correct! About time.");
		    }
		    else {
		        System.out.println("Wrong again! Maybe next time.");
		    }
		}

	}

}
