package java_Practice_Code;

import java.util.Scanner;

/* You have been tasked with writing a program for a school which produces some statistics on students’ exam results. 
 * The users are teachers who will input each student’s score, and any other necessary data. Store the scores in an array. 
 * The program should output:
 * 
 * Each student’s score and percentage for the exam
 * 
 * The mean (average) score and percentage of the exam
 * 
 * 
 */

public class School_Statistics_Students {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.print("Enter the maximum possible score for this exam: ");
		int maxScore = scanner.nextInt();
		 
		System.out.print("How many students took the exam: ");
		int numStudents = scanner.nextInt();
		 
		int[] scores = new int[numStudents];
		 
		System.out.println("\nEnter each student's score.");
		for (int i = 0; i < scores.length; i++) {
		    System.out.print("Student " + (i + 1) + ": ");
		    scores[i] = scanner.nextInt();
		}
		 
		System.out.println("\n--- Statistics ---");
		 
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
		    double studentScore = scores[i];
		    double studentPercentage = ((double)scores[i] / maxScore) * 100;
		    System.out.println("Student " + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPercentage + "%)");
		    sum += studentScore;
		}
		 
		double mean = (double)sum / scores.length;
		double meanPercentage = (mean / maxScore) * 100;
		System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");

	}

}
