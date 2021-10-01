package abstractionDemo;

abstract class AnimalDemo {
abstract void eat();
int a;
AnimalDemo()
{
	System.out.println("This is constructor");
}

static void teststatic()
{
	System.out.println("Static Method");
}
final void finaltest()
{
	System.out.println("Final Method");
}
void drink()
{
	System.out.println("All animals drink water");
}
}
