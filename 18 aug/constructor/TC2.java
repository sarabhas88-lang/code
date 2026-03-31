package ConstructorsInJava;

public class TC2 {

	public static void main(String[] args) {
		TC2 obj2 = new TC2("bipin");
		TC2 obj3= new TC2("bipin","mypassword");
		System.out.println("continue program execution");

	}

	//parameterized constructor
public TC2(String userName)
{
	System.out.println("this is user defined  paramterized constructor : "+ userName);
}
	
public TC2(String userName, String password)
{
	System.out.println("this is user defined paramterized constructor : " + userName + password);
}
}
