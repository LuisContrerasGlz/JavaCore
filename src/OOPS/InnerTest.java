package OOPS;

public class InnerTest {
public int x=0;
class FirstLevel
{
	public int x=1;
	void methodFirstLevel()
	{
		System.out.println("x is:"+x);
		System.out.println("this.x"+this.x);
		System.out.println("Inner Test this"+InnerTest.this.x);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerTest oo=new InnerTest();
		InnerTest.FirstLevel f1=oo.new FirstLevel();
		f1.methodFirstLevel();
	}

}


