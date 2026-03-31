package ConstructorsInJava;

public class Child extends Parent {

	public static void main(String[] args) {
		
	//	Child c1 = new Child();
		Parent p1 = new Child();

	}
	//Constructor does not get inherited
	public Child()
	{
		System.out.println("this is child class construtor");
	}

}
