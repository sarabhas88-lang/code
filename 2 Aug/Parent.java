package Abstraction_with_AbstractClass;

public abstract class Parent {
	
	//at least one method should be abstract in nature
	// we cannot create object of abstract class as well as interface
	
	public void m1()
	{
		System.out.println("this is m1 method of parent class");
	}
	
	//abstract method
	public abstract void foo();
	
	public abstract void bhoo();
	
}
