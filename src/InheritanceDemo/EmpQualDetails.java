package InheritanceDemo;

public class EmpQualDetails extends EmpSalDetails {
String bachelordegree;
String masterdegree;

public EmpQualDetails()
{
	//super();
	super(10,22);
	bachelordegree="BCA";
	
}
public void takeinput()
{
	
	input();
	
	System.out.println("Enter name of Bachelor Degree");
	bachelordegree=s.next();
	
	System.out.println("Enter name of Masters Degree");
	masterdegree=s.next();
	
}
public void dis()
{
	super.salary=200000;//super keyword is used to call variable of immediate parent class
	super.exp=4;
	super.dis();//super keyword is used to call method of immediate parent class
	System.out.println("Bachelor Degree is:"+bachelordegree);
	System.out.println("Masters Degree is:"+masterdegree);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpQualDetails oo=new EmpQualDetails();
		oo.takeinput();
		oo.dis();

	}

}
//There are 3 ways to use super keyoword
//1. For calling method of base class
//2. For calling variable of base class
//3. For calling constructor of base class
