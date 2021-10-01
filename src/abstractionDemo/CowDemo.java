package abstractionDemo;

public class CowDemo extends AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teststatic();
		
		CowDemo oo=new CowDemo();
		oo.eat();
		oo.drink();
		oo.finaltest();
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cow eats Veg");
		
	}

}
