package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Validations {
	
	@Test
	public void foo()
	{
		//if i is greater : mark test case as pass
		/*int i=10,j=20;
		if(i>j)
		{
			System.out.println("i is greater");
		}
		else
		{
			System.out.println("j is greater");
		}*/
		
		
		int i=10,j=20;
	//	Assert.assertTrue(i>j);
		Assert.assertTrue(i>j, "TC failed becuase i is smaller");
	}

}
