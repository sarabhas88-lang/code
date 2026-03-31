import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendingMultipleKeyboardKey_Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		//close the sign up box
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//press keyboards "cntrl + a"
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();		
		
	}

}
