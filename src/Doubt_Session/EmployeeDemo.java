package Doubt_Session;

public class EmployeeDemo {
//Encapsulation - Wrapping up of data into the class
//All the fields of Encapsulated class should be private
//All the methods should be public
private String EmpId,Name,contactNo;
private int age;
public String getEmpId() {
	return EmpId;
}
public void setEmpId(String empId) {
	EmpId = empId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
 
//1. Personal Details      - Empid,name,contactno,age
//2. Qualification Details -bachelor,masters
//3. Experience Details    - NoOfYears,CompanyName1,CompanyName2
//4. Salary details        - Current Salary,Income Tax Deduction,Pf
