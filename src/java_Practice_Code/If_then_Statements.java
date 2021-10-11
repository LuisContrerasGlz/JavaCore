package java_Practice_Code;

// Write a program with two int variables, int x and int y, and give each one a value. 
// Depending on their values, print “x is bigger than y”, “x is smaller than y”, or “x and y are the same”.
// it also prints the difference between x and y.
public class If_then_Statements {

	public static void main(String[] args) {
		int x = 91;
		int y = 75;
		 
		if (x > y) {
		    System.out.println("x is bigger than y by " + (x - y));
		}
		else if (x < y) {
		    System.out.println("x is smaller than y by " + (y - x));
		}
		else {
		    System.out.println("x and y are the same");
		}

	}

}
