import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 {
	
	@Test
	public void google()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/")
		
		//send the text over google search text box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("howstuffworks");
		
	}

}
