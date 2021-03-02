package TableSearchDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class tableSearchDemo {

	
     @Test
	public static void main(String[] args) throws Throwable {
         
		WebDriver driver;
		int age = 46;
	
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
        
        
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("San Francisco");
        String Office_location=driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(3)")).getText();
        System.out.println("The office location is " + Office_location);
 
	      	if (age < 46 ) {
	            System.out.println("The employee age is not 46 years old");
	            System.out.println("Fail");
	      	}
	        else if (age > 46) {
	        	System.out.println("The employee age is not 46 years old");
	        	System.out.println("Fail");
	        }	
	        else if (age == 46) {
	 	        	System.out.println("The age is 46 years old and the employee is station in San Francisco");
	 	        	System.out.println("Pass");	
	            
	        } else {
	           System.out.println("The employees are not station in san fransisco");
	        }
	    	
          driver.close();
	        
	}
}
