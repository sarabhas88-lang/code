package Inerhitence;

public class Child extends Parent  {

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.m1();
		c1.m2();
		c1.foo();

	}
	
	public void foo()
	{
		System.out.println("this is child class foo method");
	}

	
	
}
