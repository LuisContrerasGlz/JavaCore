package Exercise;

import java.util.Scanner;

public class CountLetters {
	
		
		public static void main (String []args)
		{
			// Paola Diaz - paoldiz
			//P: 1
			//A:5
			
			String name,last,modifier;
			int lcount =0;
			int  [][] m1=new int [3][3];
			Scanner s=new Scanner(System.in);
			System.out.println("Enter name (FN &LN): ");
			//name= s.next();
			name= s.nextLine();   // taking count space
			//last= s.next();       
			int lengthn=name.length();
			//int lengthl=last.length();
			System.out.println("Print full name "+name);
		//	System.out.println("Print"+last);
			modifier=name;
			System.out.println("Matches are displayed: "+name);
			for (int i=0; i<=lengthn-1;i++)
			{
				for (int j=0; j<=lengthn-1; j++)
				{
					if (name.charAt(i)== modifier.charAt(j) )
					{
						lcount = lcount+1;
						
					}
					
				}
				
				if (name.charAt(i)==' ')
				{ 
					lcount=0;
				}
				else
				{
				System.out.println(name.charAt(i)+" : " +lcount);
				lcount=0;
				}
			}
		}
}