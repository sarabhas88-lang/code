package ConstructorsInJava;

public class TC1 {

	public static void main(String[] args) {
		
		TC1 obj = new TC1();
		System.out.println("continue program execution");
		
	}
	
	//user defined non-parameterized constructor
	//constructor cannot have return type
	//it will be executed on object creation
	//name should be same as that of the class name(including camel casing)
	public TC1()
	{
		System.out.println("this is non parameterized constructor");
	}

}
