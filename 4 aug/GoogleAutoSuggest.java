import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//send the text over google search text box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("howstuffworks");
		
		Thread.sleep(2000);
		
		//find out total no of autosuggest
		List<WebElement> allAutoSuggest=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(allAutoSuggest.size());
		
		//click on 4th Autosuggest
		allAutoSuggest.get(3).click();

	}

}
