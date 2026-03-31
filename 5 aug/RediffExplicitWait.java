import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//how to maximize window
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		
		//click on money icon
		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		
		//click on my portfolio
		driver.findElement(By.xpath("//a[text()='My Portfolio']")).click();
		
		//send the email
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys("bipin.thakare@gmail.com");
		
		//send the password
		//driver.findElement(By.xpath("//input[@id='userpass']")).sendKeys("password");
		
		//in case of explicitwait :- time out can be given only in seconds
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='userpass']"))).sendKeys("password");
		
		
		
		
	}

}
