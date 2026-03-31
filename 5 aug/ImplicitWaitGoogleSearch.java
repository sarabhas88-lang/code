import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//send the text over google search text box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("howstuffworks");
				
	/*	Thread.sleep(2000);
	* it will pause the program execution
	* sleep is given in millisecond	
	*/
		
		//find out total no of autosuggest
		List<WebElement> allAutoSuggest=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(allAutoSuggest.size());
		
		//click on 4th Autosuggest
		allAutoSuggest.get(3).click();
	}

}
