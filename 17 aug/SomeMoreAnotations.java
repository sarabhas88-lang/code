package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SomeMoreAnotations {
	/*@BeforeSuite
	@BEforeTest
	@BeforeClass
	@BeforeMethod
	@Test
	@AfterMethod
	@AfterClass
	@AfterTest
	@AfterSuite*/
	
	
	@BeforeMethod
	public void preCondition()
	{
		System.out.println("this is before method ");
	}
	@Test
	public void tc1()
	{
		System.out.println("this is tc1");
	}
	@Test
	public void tc2()
	{
		System.out.println("this is tc2");
	}
	@Test
	public void tc3()
	{
		System.out.println("this is tc3");
	}
}
