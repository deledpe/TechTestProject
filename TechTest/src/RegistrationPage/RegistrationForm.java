package RegistrationPage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationForm {
	
	
	private static WebDriver driver;


	public void RegPages(WebDriver driver) 
	{
		this.driver=driver;
	}	
	
	//	@FindBy(how=How.LINK_TEXT,using="No, thanks!") 		
	//	WebElement click_Popbox;			
				
		@FindBy(how=How.LINK_TEXT,using="Input Forms") 
		WebElement GotoInputForm;
		
		@FindBy(how=How.LINK_TEXT,using="Input Form Submit") 		
		WebElement GotoSubmitForm;			
				
		@FindBy(how=How.NAME,using="first_name") 
		WebElement enter_firstname;
		
		@FindBy(how=How.NAME,using="last_name") 		
		WebElement enter_lastname;			
				
		@FindBy(how=How.NAME,using="email") 
		WebElement enter_email;
		
		@FindBy(how=How.NAME,using="phone") 		
		WebElement enter_phone;			
				
		@FindBy(how=How.NAME,using="address") 
		WebElement enter_address;
		
		@FindBy(how=How.NAME,using="city") 		
		WebElement enter_city;			
				
		@FindBy(how=How.NAME,using="zip") 
		WebElement enter_zip;
		
		
		@FindBy(how=How.NAME,using="state") 		
		WebElement enter_state;			
				
		@FindBy(how=How.NAME,using="website") 
		WebElement enter_hosting;
		
		@FindBy(how=How.NAME,using="comment") 
		WebElement enter_description;
		
		@FindBy(how=How.XPATH,using="//button[@type='submit']") 
		WebElement click_button;
		
		@FindBy(how=How.XPATH,using="//div[@id='home']/h3") 		
		WebElement welcome_Message;
		

		
		
		public void ValidRegForm (String vFirstname, String vlastname, String vEmail, String vPhone, String vAddress, String vCity, String vZip, String vState, String vHosting, String vDescription) throws IOException, Throwable{
			
	
        //    click_Popbox.click();
			GotoInputForm.click();
			GotoSubmitForm.click();
			
			enter_firstname.sendKeys(vFirstname);
			enter_lastname.sendKeys(vlastname);
			enter_email.sendKeys(vEmail);
			enter_phone.sendKeys(vPhone);
			enter_address.sendKeys(vAddress);
			enter_city.sendKeys(vCity);
			enter_zip.sendKeys(vZip);	
			enter_state.sendKeys(vState);
			enter_hosting.sendKeys(vHosting);
			enter_description.sendKeys(vDescription);
			click_button.click();
			Thread.sleep(3);
			welcome_Message.getText();
			
			
			try {
					String view_Welcome_Message = welcome_Message.getText();
					System.out.println("Registration is unsuccessful " + view_Welcome_Message);
					takesScreenshot(" Welcome message is displayed ");
			}catch(Exception e) {
				
				System.out.println("Registration is unsuccessful");				
				
			}
			
		}       
	       public static void takesScreenshot (String filename) throws IOException {    			
	       	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	       // FileHandler.copy(file, new File ("C:/Users/Allogogate/git/SeleniumDataDrivenFrameworkGit/POMPAGEFactory/Screenshots/" + filename+".png"));
	          FileHandler.copy(file, new File ("C:\\Users\\bamid\\eclipse-workspace\\TechTest\\Screenhots\\" + filename+".png"));
	          
	       }   
		

}
