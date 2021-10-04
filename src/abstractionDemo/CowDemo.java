package abstractionDemo;

public class CowDemo extends AnimalDemo {

	public static void main(String[] args) {
		
		teststatic();
		
		CowDemo oo=new CowDemo();
		oo.eat();
		oo.drink();
		oo.finaltest();
	}

	@Override
	void eat() {
		
		System.out.println("Cow eats Veg");
		
	}

}
