package Doubt_Session;

public class ConstructorDemo {
	int num1,num2;//Instance Variable
	public ConstructorDemo()
	{
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo oo=new ConstructorDemo();//calling here default constructor
		System.out.println("Num1 is:"+oo.num1);
		System.out.println("Num2 is:"+oo.num2);
	}

}

//JVM Memory Structure
/*1. Heap Memory---Objects
2. Stack Memory--Variables
3. Static memory---Static Data
4. code memory--.class file
5. String Constant Pool-- String Literals*/

