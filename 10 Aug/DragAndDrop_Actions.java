import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		//find out total number of iframes
		List<WebElement> allIframe=driver.findElements(By.tagName("iframe"));
		System.out.println("total no of iframes are : "+ allIframe.size());
		
		driver.switchTo().frame(0);
		
		//source
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
				
		//destination
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
		driver.switchTo().defaultContent();
		
		
	}

}
