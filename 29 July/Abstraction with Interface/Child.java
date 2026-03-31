package Abstraction_with_Interface;

public class Child implements Begger{
	//it is mandatory on child class/implementing class to give definition to all the methods from Interface

	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.owningBunglow();
		c1.car();
		System.out.println(Begger.i);
	}
	
	public void owningBunglow()
	{
		System.out.println("implementing the dream of owning Bulnglow");
	}

	public void car()
	{
		System.out.println("implementing the dream of owning car");
	}
}
