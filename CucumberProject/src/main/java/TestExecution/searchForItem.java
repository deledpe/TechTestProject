package TestExecution;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class searchForItem {
	
	WebDriver driver;
	
	@Given("^that user is on https://www\\.takealot\\.com$")
	public void that_user_is_on_https_www_takealot_com() throws Throwable {	    
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.takealot.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	@Given("^enter the product name as \"([^\"]*)\"$")
	public void enter_the_product_name_as(String ItemName) throws Throwable {
		driver.findElement(By.className("modal-module_close-button_asjao")).click();
		driver.findElement(By.name("search")).sendKeys(ItemName);
		
	}	
	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	@Then("^all the related items should be displayed$")
	public void all_the_related_items_should_be_displayed() throws Throwable {
		driver.findElement(By.className("search-count toolbar-module_search-count_P0ViI search-count-module_search-count_1oyVQ")).isDisplayed();
		String product =driver.findElement(By.className("search-count toolbar-module_search-count_P0ViI search-count-module_search-count_1oyVQ")).getText();
		

		 try  { 			
				 driver.findElement(By.className("search-count toolbar-module_search-count_P0ViI search-count-module_search-count_1oyVQ")).isDisplayed();
				 String product1 =driver.findElement(By.className("search-count toolbar-module_search-count_P0ViI search-count-module_search-count_1oyVQ")).getText();	 
			      System.out.println("The product count is " + product1);			 			 
		    	  System.out.println("Pass");
		    }catch (Exception e ){
		    	System.out.println("Object does not exists");
		    	System.out.println("Fail"); 
		    }

	}
	@Then("^user click on add to basket and item price should be displayed$")
	public void user_click_on_add_to_basket_and_item_price_should_be_displayed() throws Throwable {	
		driver.findElement(By.cssSelector("button  expanded add-to-cart-button add-to-cart-button-module_add-to-cart-button_1a9gT ghost")).click();		
		
		 try  { 				
			 String itemPrice =driver.findElement(By.cssSelector("currency plus currency-module_currency_29IIm")).getText();
				System.out.println("" + itemPrice);
		    	System.out.println("Pass");
		    }catch (Exception e ){
		    	System.out.println("Object does not exists");
		    	System.out.println("Fail"); 
		      }		
	}

	@When("^user click on Got-To-Cart$")
	public void user_click_on_Got_To_Cart() throws Throwable {
		driver.findElement(By.cssSelector("button checkout-now dark")).click();
	}

	@Then("^user should see the items in Cart summary$")
	public void user_should_see_the_items_in_Cart_summary() throws Throwable {
		driver.findElement(By.cssSelector("product-anchor cart-item-module_product-anchor_g4hEN")).getText();
		driver.findElement(By.cssSelector("currency plus currency-module_currency_29IIm")).getText();
				
	}
	@When("^user click on proceed to checkout$")
	public void user_click_on_proceed_to_checkout() throws Throwable {
		driver.findElement(By.cssSelector("button pay checkout-button cart-summary-module_proceed-to-checkout-btn_3tQOD checkout-button-module_checkout-button_3B_QV")).click();
		
	}
	@Then("^user should prompt to login$")
	public void user_should_prompt_to_login() throws Throwable {
	
		driver.findElement(By.id("email")).sendKeys("deledpe");	  
		driver.findElement(By.id("password")).sendKeys("Password@1");
		driver.findElement(By.cssSelector(".g-recaptcha")).click();
	
	}
	@Then("^application should display order summary and total price$")
	public void application_should_display_order_summary_and_total_price() throws Throwable {
		driver.findElement(By.cssSelector("checkout-sidebar-order-summary panel panel-collapse")).getText();		

	}		
	@Then("^close the browserb$")
	public void close_thebrowserb() throws Throwable {
		driver.quit();
	 
		
	}

}
