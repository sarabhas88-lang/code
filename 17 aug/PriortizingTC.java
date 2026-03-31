package testNG;

import org.testng.annotations.Test;

public class PriortizingTC {
	
	@Test(priority=0)
	public void login()
	{
		System.out.println("this is login test");
	}

	@Test(priority=1)
	public void compose()
	{
		System.out.println("this is compose method");
	}
}
