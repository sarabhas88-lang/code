package testNG;

import org.testng.annotations.Test;

public class MultipleTestCases {
	
	@Test
	public void b()
	{
		System.out.println("this is b method");
	}

	@Test
	public void a()
	{
		System.out.println("this is a method");
	}
}
