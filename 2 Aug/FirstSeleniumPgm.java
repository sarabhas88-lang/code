import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumPgm {

	public static void main(String[] args) {
		//how to open chrome
		System.setProperty("webdriver.chrome.driver", "D:\\software\\ChromeDriver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//cntrl + shift + o :- for importing all the required jars
		
		//how to send the URL
		driver.get("https://www.howstuffworks.com/");
	}

}
