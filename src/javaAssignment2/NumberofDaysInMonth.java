package javaAssignment2;
import java.util.Scanner;

//Write a Java program to find the number of days in a month.
public class NumberofDaysInMonth {

	public static void main(String[] args) {
		int m,y,days=0;
		Scanner s= new Scanner(System.in);
	    
		System.out.println("enter a month number");
		m=s.nextInt();
		if(m<=12 && m>=1)
		{
		System.out.println("enter year");
		y=s.nextInt();
		if(m==1 || m==3 ||m==5 ||m==7||m==8||m==10||m==12)
		{
			days=31;	 
		}
		else 
		if(m==4||m==6||m==9||m==11)
		{
		days=30;	  
		}
		else 
		{
		if(m==2)
		{
		if(y%400==0&&y%100==0)
		{
		days=29;
		}
		else  
		{
		if(y%4==0&&y%100!=0)
		{
		days=29;
		}
		else
		days=28;
		}
		}
		 	       	
		}	
		System.out.println("Number of days in " + m+" month "+y+ "  year is :"+days);
		}
		else
		System.out.println("entered month number is not there in the calender");
		s.close();             

	}

}
