import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		//print the current price of IRCTC
		
		//fetch the list of all the companies
		List<WebElement> allCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	
		//fetch the current price of all the companies
		List<WebElement> allPrices=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	
		for(int i=0;i<allCompanies.size();i++)
		{
			if(allCompanies.get(i).getText().equalsIgnoreCase("IRCTC"))
			{
				System.out.println(allPrices.get(i).getText());
				break;
			}
		}
		
	
	}
	

}
