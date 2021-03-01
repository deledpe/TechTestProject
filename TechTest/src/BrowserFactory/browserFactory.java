
// Code 2 developed 

package BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class browserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String url) {	
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\browserDriver\\IEDriverServer.exe");
		
	
		if(browserName.equalsIgnoreCase("Firefox")) 
		{
			driver = new FirefoxDriver ();
		   
		}
		else if(browserName.equalsIgnoreCase("IE")) 
		{
			

			driver = new InternetExplorerDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome")) {
			
			driver= new ChromeDriver();			
		}
		 driver.manage().window().maximize();
		 driver.get(url);
		 
		 return driver;
	}
}
