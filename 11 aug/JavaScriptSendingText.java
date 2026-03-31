import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptSendingText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/?.lang=en-IN&src=homepage&.done=https%3A%2F%2Fin.yahoo.com%2F%3Fp%3Dus&pspid=97684142&activity=ybar-signin");
		
		//sending the text over text box
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("selenium");
		
		JavascriptExecutor jse=(JavascriptExecutor) driver; //type casting
		jse.executeScript("document.getElementById('login-username').value='Selenium'");	
		
	}

}
