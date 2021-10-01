package OOPS;

public class EmpDetails {
	public void input() {
		EmployeeDemo oo=new EmployeeDemo();
		//oo.setEmpid("E128");
		oo.setName("Paola");
		oo.setContactno("+51907979");
		System.out.println(oo.getEmpid());
		System.out.println(oo.getName());
		System.out.println(oo.getContactno());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails obj=new EmpDetails();
		obj.input();
	}

}
