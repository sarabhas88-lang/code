import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/?.lang=en-IN&src=homepage&.done=https%3A%2F%2Fin.yahoo.com%2F%3Fp%3Dus&pspid=97684142&activity=ybar-signin");
		
		//FileInputStream ip = new FileInputStream("D:\\Bipin\\19th July 2021\\Selenium program\\src\\allXpath.properties");
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\common.properties");
		Properties prop = new Properties();
		prop.load(ip);
		
	System.out.println(prop.getProperty("userName_txtBox"));
	System.out.println(prop.getProperty("next_button"));
		
		driver.findElement(By.xpath(prop.getProperty("userName_txtBox"))).sendKeys("bipin.thakare");
	}

}
