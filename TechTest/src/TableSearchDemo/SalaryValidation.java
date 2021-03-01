package TableSearchDemo;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SalaryValidation {
	
  
	static WebDriver driver;
	
    @Test
	public static void main(String[] args) {
		
		int salary= 206850;
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
        
        
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Software Engineer");
        String Office_location=driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(3)")).getText();
        String Role=driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(3)")).getText();
        System.out.println("The office is located " + Office_location);
	        
	        if ( salary > 206850) {
	        	
	        	System.out.println("The highest is salary");	        	
	        	System.out.println("Fail");
	        }	        
	        else if (salary < 206850) {
	        	
	        	System.out.println("The is not the highest salary");	        	
	        	System.out.println("Fail");
	        	      	
	        }
	        else if (salary == 206850) {
	        	System.out.println("The highest salary for Software Engineer is $206,850y ");
	        	System.out.println("Pass");
        	
	        }
	        else {
	        	System.out.println("No employee with such as salary");
            }
	        driver.close();
	}
}
