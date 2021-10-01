package InheritanceDemo;

public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 oo=new demo1();
		oo.p(20.4);
		oo.p(45);
		demo obj=new demo();
		obj.p(2);
	}

}
final class demo
{
	public void p(double i)
	{
		System.out.println(i*2);
	}
}
class demo1 extends demo
{
	public void p(double i)
	{
		p(5);
		System.out.println(i);
	}
	
}
