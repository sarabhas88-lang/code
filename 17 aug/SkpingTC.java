package testNG;

import org.testng.annotations.Test;

public class SkpingTC {
	
	
	@Test
	public void tc1()
	{
		System.out.println("this is tc1");
	}

	/*@Test
	public void tc2()
	{
		System.out.println("this is tc2");
		throw new SkipException("skipping this test case purposefully");
	}	*/

	@Test(enabled=false)
	public void tc3()
	{
		System.out.println("this is tc3");
	}
}


