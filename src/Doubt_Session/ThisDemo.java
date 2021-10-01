package Doubt_Session;

public class ThisDemo {
	int a=10,b;
	public void test(int a,int b)
	{
		System.out.println(this.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo oo=new ThisDemo();
		oo.test(1000, 2000);
	}

}
//this is a pointer which refer to current class objects
