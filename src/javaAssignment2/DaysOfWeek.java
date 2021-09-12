package javaAssignment2;

import java.util.Scanner;

// WAP  to enter the days of week and print name of  day-- switch case, Ladderif
public class DaysOfWeek {

	public static void main(String[] args) {

		int day;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number to check on the day of the week: ");
		day=s.nextInt();
        
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        

        }
        s.close();
  }
}
