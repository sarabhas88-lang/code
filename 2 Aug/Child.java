package Abstraction_with_AbstractClass;

public class Child extends Parent{

	
	public static void main(String[] args) {
		
		Child c1 = new Child();
		c1.foo();
		c1.bhoo();
		c1.m1();
	}

	public void foo()
	{
		System.out.println("this is foo method with implementation");
	}
	public void bhoo()
	{
		System.out.println("this is bhoo method with implementation");
	}
	
}
