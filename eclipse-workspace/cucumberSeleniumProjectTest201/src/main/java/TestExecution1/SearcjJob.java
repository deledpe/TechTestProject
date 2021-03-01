package TestExecution1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SearcjJob {
	
	WebDriver driver;
	
	@Given("^that user is on https://jobserve\\.co\\.uk$")
	public void that_user_is_on_https_jobserve_co_uk() throws Throwable {
		System.out.println("Test1 check");		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://jobserve.co.uk");
        
        Thread.sleep(3000);
       

	}
	@When("^I enter the job title Software testing and job location London\\. Click search button$")
	public void i_enter_the_job_title_Software_testing_and_job_location_London_Click_search_button() throws Throwable {
        driver.findElement(By.id("txtKey")).sendKeys("Business Analyst");
        driver.findElement(By.id("txtLoc")).sendKeys("London");
       		 
		 driver.findElement(By.id("btnSearch")).click();
		 
		System.out.println("Test2");
	}

	@When("^I should see the number of the jobs find  and the job title$")
	public void i_should_see_the_number_of_the_jobs_find_and_the_job_title() throws Throwable {
		System.out.println("Test3");

	}

	@When("^close the browser$")
	public void close_the_browser() throws Throwable {
		System.out.println("Test4");
;
	}



}
