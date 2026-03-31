import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		//close the login box
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		WebElement login =driver.findElement(By.xpath("//a[text()='Login']"));
		
		//Actions class :- it is used for mouse as well as keyboard simulation
		Actions act = new Actions(driver);
		act.moveToElement(login).build().perform();
		
		/*WebDriverWait wait= new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='My Profile']"))).click();
		*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='My Profile']")).click();
	}

}
