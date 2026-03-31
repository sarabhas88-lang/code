import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingTextIntoTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		//user name
		driver.findElement(By.id("email")).sendKeys("bipin.thakare");
		
		//password
		driver.findElement(By.id("pass")).sendKeys("any passowrd");
		
	}

}
