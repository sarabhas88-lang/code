import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffShareMarket {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//how to maximize window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//fetch the current price of Bharti Airtel
	}

}
