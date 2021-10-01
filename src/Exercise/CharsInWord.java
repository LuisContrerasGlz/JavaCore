package Exercise;

import java.util.Scanner;

public class CharsInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
        int i, length, counter[] = new int[256];
 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word:");
        str = s.nextLine().toUpperCase();
        
 
        length = str.length();
        s.close();
        
        // Count frequency of every character and store
        // it in counter array
        for (i = 0; i < length; i++) {
            counter[(int) str.charAt(i)]++;
        }
        // Print Frequency of characters
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println("Character '"+(char) i + "' is present " + counter[i]+" time(s).");
            }
        }
    }
	}

