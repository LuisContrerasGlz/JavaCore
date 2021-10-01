package OOPS;

public class ThisDemo {
	private float radius=56.4f;
	int num1;
	public void findarea(float radius)
	{
		System.out.println(this.radius);
		System.out.println(radius);
	}
	public ThisDemo()
	{
		//this(35);//Calling Parameterized Constructor
		num1=10;
		System.out.println("Num1 is:"+num1);
		
	}
	public ThisDemo(int n)
	{
		this();
		System.out.println(n);
	}
	public static void main(String[] args) {
		//System.out.println(this.radius);
		// TODO Auto-generated method stub
//		ThisDemo oo=new ThisDemo();
//		oo.findarea(12.34f);
		ThisDemo obj=new ThisDemo(45);
	}

}
