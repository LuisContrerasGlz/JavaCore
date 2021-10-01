package InheritanceDemo;

import java.util.Scanner;

public class EmpSalDetails extends EmployeePerDetails   {
		int exp;
		float salary;
		//Scanner s1=new Scanner(System.in);
		//EmployeePerDetails oo=new EmployeePerDetails();
		public EmpSalDetails()
		{
			super.input();
			exp=4;
			salary=35555.5f;
		}
		public EmpSalDetails(int a,int b) {
			System.out.println("a is:"+a);
			System.out.println("b is:"+b);
		}
		public void inp()
		{
			
			//oo.input();
			System.out.println("Enter Experience in Years");
			exp=s.nextInt();
			
			System.out.println("Enter Salary");
			salary=s.nextFloat();
			
		}
		public void dis()
		{
			super.display();
			System.out.println("Experience is:"+exp);
			System.out.println("Salary is:"+salary);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			EmpSalDetails obj=new EmpSalDetails();
			obj.inp();
			obj.dis();
	}

}
/*super class --- Parent Class
sub class  ---Child Class*/
/*super keyword can be used in 3 ways:
variables
Methods
Constructor*/