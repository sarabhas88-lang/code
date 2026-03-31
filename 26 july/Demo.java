
public class Demo {

	//static method can access only static things
	
	
	static int i=10;//global
	int m=99;//global & non static
	
	public static void main(String[] args) {
		//which things i can make static
		// variables :-only global variables can be made static. local variables cannot be made static 
		//method :- can be made static 
		//object :- yes 
		System.out.println(i);//10
		
		// static int k=22; local varible cannot be made statid
		
		
	//	System.out.println(m); becuase it was non static
		foo();//calling a static method
	//	anyMethod(); non static
		
	}

	public static void foo()
	{
		System.out.println(i);//10
		System.out.println("this is foo method and its static");
	}
	public void myMethod()
	{
		System.out.println("this is my method & its non static");
	}
	
}
