package testNG;

import org.testng.annotations.Test;

public class PermutationOfPriorty {
	
	@Test(priority=-12)
	public void b()
	{
		System.out.println("this is b method");
	}

	@Test(priority=1)
	public void a()
	{
		System.out.println("this is a method");
	}
	
	@Test(priority=5)
	public void c()
	{
		System.out.println("this is c method");
	}

}
