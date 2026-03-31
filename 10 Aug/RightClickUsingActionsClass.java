import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		//close the login box
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		WebElement login =driver.findElement(By.xpath("//a[text()='Login']"));
		//right click :- context click
		
		Actions act = new Actions(driver);
		act.contextClick(login).build().perform();
		
	}

}
