import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		
		//find out how many radio buttons are there in 1st group
		//System.out.println(driver.findElements(By.xpath("//input[@name='software']")).size()); //one way of finding total number of elements
		
		List<WebElement> allRadio=driver.findElements(By.xpath("//input[@name='software']"));
		System.out.println(allRadio.size());
		
		//click on the third radio button
		allRadio.get(2).click();
	}

}
