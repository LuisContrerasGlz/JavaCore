package abstractionDemo;

import java.util.Scanner;

public interface EmployeeDet {
		String companyname="QASource";
		
		void perDet();
		void disp_PerDet();
		Scanner s=new Scanner(System.in);
		static void acc()
		{
			System.out.println("Static method of an interface");
		}
		default void displayy()
		{
			System.out.println("Default method of an Interface");
		}
		
		
}
/*Does Java is 100% Object oriented Language
Wrapper Classes
int ----Integer
float---Float
*/