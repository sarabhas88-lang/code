package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActualCode {
	static WebDriver driver;//global
	static
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\Chromedriver93\\chromedriver.exe");
		 driver = new ChromeDriver();

	}
	
	@Given("^user opens chrome$")
	public void user_opens_chrome() throws Throwable {
		
				 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("^user enters login crdentials$")
	public void user_enters_login_crdentials() throws Throwable {
		driver.get("https://www.facebook.com/");
		
		//user name
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("SeleniumForSure@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Password_123");
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	    
	}

	@Then("^login should be succesful$")
	public void login_should_be_succesful() throws Throwable {
		System.out.println("login is succeful: for more implementaion look out for the isElementPResent method from our framework");
	   
	}

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("call again isElementPresent method ");
	   
	}

	@When("^clicks on friend page link$")
	public void clicks_on_friend_page_link() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Find Friends']")).click();
	    
	}

	@Then("^user should be navigated to that page$")
	public void user_should_be_navigated_to_that_page() throws Throwable {
		System.out.println("use isLinkPresentMethod but pass on the webelemtn from the friends page");
	   
	}


}
