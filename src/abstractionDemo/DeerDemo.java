package abstractionDemo;

public class DeerDemo extends AnimalDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeerDemo oo=new DeerDemo();
		oo.eat();
		oo.demo();
		//AnimalDemo obj=new AnimalDemo();
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Deer eats Non Veg");
		a=100;
		System.out.println(a);
		drink();
		
	}
	void demo()
	{
		System.out.println("Demo Test");
	}

}
