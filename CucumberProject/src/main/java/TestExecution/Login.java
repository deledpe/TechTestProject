package TestExecution;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class Login {
	
	WebDriver driver;
	
	
	@Test
	@Given("^that I am on https://www\\.takealot\\.com$")
	public void that_I_am_on_https_www_takealot_com() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.takealot.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Given("^click on login link$")
	public void click_on_login_link() throws Throwable {
		
		driver.findElement(By.className("modal-module_close-button_asjao")).click();
		driver.findElement(By.linkText("Login")).click();
		System.out.println("Click on login link");
		
	
	}

	@Given("^enter the EmailAddress as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void enter_the_EmailAddress_as_and_Password_as(String EmailAddress, String  password) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(EmailAddress);	  
		driver.findElement(By.id("password")).sendKeys(password);
		
		System.out.println("test 2");

	}

	@Given("^click on login button$")
	public void click_on_login_button() throws Throwable {
		driver.findElement(By.cssSelector(".g-recaptcha")).click();
	//	driver.findElement(By.cssSelector("recaptcha-verify-button")).click();
		System.out.println("test 3");

	}

	@Then("^application should display MyAccount and the account holder name\\.$")
	public void application_should_display_MyAccount_and_the_account_holder_name() throws Throwable {
		
		String WelcomeMesaageUsername = driver.findElement(By.id("")).getText();
		System.out.println(" User welcome message is displayed as " + WelcomeMesaageUsername);
	   
	}
	@Then("^username should be displayed on the welcome page$")
	public void username_should_be_displayed_on_the_welcome_page() throws Throwable {
		
		driver.findElement(By.cssSelector("top-nav-module_name-item_3ROu0")).isDisplayed();
		String WelcomeMessage =driver.findElement(By.cssSelector("top-nav-module_name-item_3ROu0")).getText();
		System.out.println("User is displayed as " + WelcomeMessage);

		 try  { 			
			 String WelcomeMessage1 =driver.findElement(By.cssSelector("my-account-dropdown top-nav-module_my-account-dropdown_2Pp-I")).getText();
				System.out.println("Welcome is " + WelcomeMessage);
		    	System.out.println("Pass");
		    }catch (Exception e ){
		    	System.out.println("Object does not exists");
		    	System.out.println("Fail"); 
		    }
		
		System.out.println("test 4");

	}
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
       driver.quit();
       
       System.out.println("test 5");
	}

}
