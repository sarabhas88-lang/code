import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpNaukari {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		String mainWindow=itr.next();
		System.out.println(mainWindow);
		
		String popup1=itr.next();
		String popoup2=itr.next();
		String popup3=itr.next();
		
		//switch to any of the popup
		driver.switchTo().window(popoup2);
		//fetch the title
		System.out.println(driver.getTitle());
		//close this popup
		driver.close();
	
	
	}

}
