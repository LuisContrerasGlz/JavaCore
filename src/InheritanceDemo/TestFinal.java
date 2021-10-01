
package InheritanceDemo;
import java.util.Scanner;


public class TestFinal {
	static final float pie=3.14f;
	float radius = 12.2f, findarea;
//	public TestFinal()
//	{
//		pie=3.14f;
//	}
//	{
//		pie=3.14f;
//	}
	public void area() {
		findarea = pie * radius * radius;
		System.out.println("Area of Circle is:" + findarea);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinal oo = new TestFinal();
		oo.area();
	}

}
