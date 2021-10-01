package OOPS;

public class EmployeeDemo {
	private String empid="e1001";//ReadOnly field
	private String name;
	private String contactno;
	public String getEmpid() {
		return empid;
	}
//	public void setEmpid(String empid) {
//		this.empid = empid;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
}
