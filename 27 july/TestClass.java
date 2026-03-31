
public class TestClass {

	int i=99;
	
	public static void main(String[] args) {
		
		TestClass t1 = new TestClass();
		System.out.println(t1.i);//now you can access non static variables as well
			
		t1.foo();//now you can access non static methods as well
		
		myMethod();
		TestClass.myMethod();
		
	}

	public void foo()
	{
		System.out.println("this is foo method");
	}
	
	public static void myMethod()
	{
		TestClass t2 = new TestClass();
		t2.i=76;
		System.out.println(t2.i);
		
		t2.foo();
	}
}
