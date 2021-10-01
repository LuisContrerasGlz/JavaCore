package abstractionDemo;

public class Employee_Per_Details extends DeerDemo implements IEmpQualDet,EmployeeDet
{
	String empId,Name,bachelordegree,mastersdegree;
	long contactno;
	
	@Override
	public void perDet() {
		
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id");
		empId=s.next();
		
		System.out.println("Enter Name of Employee");
		Name=s.next();
		
		System.out.println("Enter Contact No");
		contactno=s.nextLong();
		EmployeeDet.acc();//Calling Static method of an Interface
		
		
	}

	@Override
	public void disp_PerDet() {
		// TODO Auto-generated method stub
		System.out.println("Emp id is:"+empId);
		System.out.println("Name is:"+Name);
		System.out.println("Contact No:"+contactno);
		System.out.println("Company Name:"+companyname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Per_Details oo=new Employee_Per_Details();
		oo.perDet();
		oo.inputQual();
		oo.disp_PerDet();
		oo.dispQual();
		oo.displayy();//Calling Default method of an Interface
	}

	@Override
	public void inputQual() {
		// TODO Auto-generated method stub
		System.out.println("Enter Bachelor Degree");
		bachelordegree=s.next();
		
		System.out.println("Enter Masters Degree");
		mastersdegree=s.next();
		
	}

	@Override
	public void dispQual() {
		// TODO Auto-generated method stub
		System.out.println("Bachelor Degree is:"+bachelordegree);
		System.out.println("Masters Degree is:"+mastersdegree);
	}

	

}
