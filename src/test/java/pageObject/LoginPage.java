package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
		@FindBy(xpath="//input[@id='input-email']") WebElement emailAddress;
		@FindBy(xpath="//input[@id='input-password']") WebElement passwordForLoginPage;
		@FindBy(xpath="//input[@type='submit']") WebElement SubmitinLoginPage;
		
		public void setEmailAddress(String email)
		{
			emailAddress.sendKeys(email);
		}
		public void setPassword(String pass)
		{
			passwordForLoginPage.sendKeys(pass);
		}
		public void clickSubmit()
		{
			SubmitinLoginPage.submit();
		}
		
		
	

}
