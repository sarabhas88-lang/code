import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/account/create?.lang=en-IN&src=homepage&activity=ybar-signin&pspid=97684142&.done=https%3A%2F%2Fin.yahoo.com%2F%3Fp%3Dus&specId=yidReg&done=https%3A%2F%2Fin.yahoo.com%2F%3Fp%3Dus");
		
		//ready made class to automate Drop down box :- Select
		WebElement dropDownList=driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		Select s = new Select(dropDownList);
	//	s.selectByVisibleText("August");
	//	s.selectByValue("4");
	//	s.selectByIndex(6);//June
		
		//how to automate drop down box without select tag
		dropDownList.sendKeys("November");
		
		//how to know whether the drop down allows multiple select
	System.out.println(s.isMultiple());
		
	}

}
