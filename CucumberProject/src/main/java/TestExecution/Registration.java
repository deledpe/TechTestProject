package TestExecution;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class Registration {
	
	WebDriver driver;
	
	@Test
	@Given("^that I am navigate to https://www\\.takealot\\.com$")
	public void that_I_am_navigate_to_https_www_takealot_com() throws Throwable {
      
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.takealot.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@And("^click on register link$")
	public void click_on_register_link() throws Throwable {
		driver.findElement(By.className("modal-module_close-button_asjao")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		
	}
	@Then("^complete the registration form$")
	public void complete_the_registration_form(DataTable testdata) throws Throwable {
	     
		
		Map<String,String> testDataAsMap =testdata.asMap(String.class, String.class);
		
		driver.findElement(By.id("firstname")).sendKeys(testDataAsMap.get("FirstName"));
        driver.findElement(By.id("surname")).sendKeys(testDataAsMap.get("LastName"));
        driver.findElement(By.id("email")).sendKeys(testDataAsMap.get("EMail"));
        driver.findElement(By.id("email2")).sendKeys(testDataAsMap.get("ReTypeEmail"));
        driver.findElement(By.id("password")).sendKeys(testDataAsMap.get("Password"));
        driver.findElement(By.id("password2")).sendKeys(testDataAsMap.get("ReTypePassword"));
        driver.findElement(By.id("telno1")).sendKeys(testDataAsMap.get("MobileNumber"));
        driver.findElement(By.id("day")).sendKeys(testDataAsMap.get("BirthdayDay"));
        driver.findElement(By.id("month")).sendKeys(testDataAsMap.get("BirthdayMonth"));
        driver.findElement(By.id("year")).sendKeys(testDataAsMap.get("BirthdayYear"));
		
	}

	@Then("^click on Register Now button$")
	public void click_on_Register_Now_button() throws Throwable {
		driver.findElement(By.name("registerButton")).click();
		
		driver.findElement(By.linkText("here")).click();
		

	}

	@Then("^user see their My Account link and their name$")
	public void user_see_their_My_Account_link_and_their_name() throws Throwable {
		driver.findElement(By.className("top-nav-module_name-item_3ROu0")).isDisplayed();
		String WelcomeMessage =driver.findElement(By.className("top-nav-module_name-item_3ROu0")).getText();
		System.out.println("Weclome is " + WelcomeMessage);

		 try  { 			
			 String WelcomeMessage1 =driver.findElement(By.className("top-nav-module_name-item_3ROu0")).getText();
				System.out.println("Welcome is " + WelcomeMessage1);
		    	System.out.println("Pass");
		    }catch (Exception e ){
		    	System.out.println("Object does not exists");
		    	System.out.println("Fail"); 
		    }
		 
		 try  { 			
			 String DuplicateRegistration =driver.findElement(By.className("That email address is already registered on takealot.com.")).getText();
				System.out.println("User have already registered, login to prevenet " + DuplicateRegistration);
		    	System.out.println("Pass");
		    }catch (Exception e ){
		    	System.out.println("Object does not exists");
		    	System.out.println("Fail"); 
		    }	 
		 
        	}
		 @Then("^close the browsers$")
		 public void close_the_browsers() throws Throwable {
			 driver.quit();

		 }
		
	}

