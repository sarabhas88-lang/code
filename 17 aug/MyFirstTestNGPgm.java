package testNG;

import org.testng.annotations.Test;

public class MyFirstTestNGPgm {
	@Test
	public void foo()
	{
		System.out.println("this is test case 1 : foo" );
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("this is test case 2");
		tc3();
	}

	public void tc3()
	{
		System.out.println("this is tc3");
	}
}
