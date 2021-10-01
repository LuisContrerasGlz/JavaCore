package Exercise;

import java.util.Scanner;

public class StringCounterChristian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalStc, lowerStc;
		int counter;
		char alphabet[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
				          'o','p','q','r','s','t','u','v','w','x','y','z', ' '};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter a sentence");
		originalStc= sc.nextLine();		
		
		lowerStc= originalStc.toLowerCase();
		char letters[]= lowerStc.toCharArray();
		
		for(int i=0; i<alphabet.length; i++) 
		{	
			counter=0;
			for(int j=0; j<letters.length; j++) 
			{
				if(letters[j] == alphabet[i]) 
				{
					counter++;
				}
			}System.out.println("Character " + alphabet[i] + " is present " 
					+ counter + " times" );
		}		
	}
	}

