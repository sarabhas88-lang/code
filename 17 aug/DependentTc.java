package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTc {

	
	@Test
	public void login()
	{
		System.out.println("this is login test");
		Assert.assertTrue(false);//fail
	}

	@Test(dependsOnMethods="login")
	public void compose()
	{
		System.out.println("this is compose method");
	}
	
	@Test(dependsOnMethods= {"login","compose"})
	public void sendEmail()
	{
		System.out.println("this is send email method");
	}
}
