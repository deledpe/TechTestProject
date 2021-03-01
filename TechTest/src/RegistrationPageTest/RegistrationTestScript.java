package RegistrationPageTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BrowserFactory.browserFactory;
import RegistrationPage.RegistrationForm;



public class RegistrationTestScript {
	
	
	@Test
	public void verifySearch () throws IOException {
				
		WebDriver driver =browserFactory.startBrowser("IE","https://www.seleniumeasy.com/test/");
	
		 RegistrationForm ValidRegForm=PageFactory.initElements(driver,RegistrationForm.class);
		 	 
//		 ValidRegForm.ValidRegForm(vFirstname, vlastname, vEmail, vPhone, vAddress, vCity, vZip, vState, vHosting, vDescription);
		 
		 ValidRegForm.ValidRegForm("john","Tester", "john@gmail.com", "078976666666", "123 london rd", "London", "SW104Gh", "London", "www://johnqa.com", "Hello world");
		 
		 driver.quit();  		
	}
	
	
	


}
