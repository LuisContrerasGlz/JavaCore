package OOPS;

public class StaticDemo {
	static int a;
	//int test=56;
	public void input()
	{
		int test=56;//Local Variable
		for(int i=0;i<10;i++)
		{
			
		}
	}
	public void display()
	{
		//input();
		//System.out.println(test);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.a=100;//Accessing static variables with class name because it exist in memory even before the creation of an object
		StaticDemo obj=new StaticDemo();
		obj.a=1000;
		StaticDemo oo=new StaticDemo();
		System.out.println(oo.a);
	}

}
//1. Static variables prefixed with static keyword
//2. static variable exist in memory even before the creation of an object because it belongs to class 
//that's why we call it class variable as well
//3. static variables overrides its value
//4. It shares the same copy among all the objects.
