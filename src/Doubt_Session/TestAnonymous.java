package Doubt_Session;

public class TestAnonymous {
interface hello
{
	public void greet();
	public void greetSomeone(String someone);
}
public  void sayHello()
{
	class EnglishGreeting implements hello
	{
		String name="world";

		@Override
		public void greet() {
			// TODO Auto-generated method stub
			greetSomeone("world");
		}

		@Override
		public void greetSomeone(String someone) {
			// TODO Auto-generated method stub
			name=someone;
			System.out.println("Hello"+name);
			
		}
	
	}
	//Demo dd=new EnglishGreeting();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
