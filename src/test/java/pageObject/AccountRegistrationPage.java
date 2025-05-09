package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage {
	
	WebDriver driver;
	
	public AccountRegistrationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@name='firstname']") WebElement txtFirstName;
@FindBy(xpath="//input[@name='lastname']") WebElement txtLastName;
@FindBy(xpath="//input[@name='email']") WebElement txtEmail;
@FindBy(xpath="//input[@name='telephone']") WebElement txtTelephone;
@FindBy(xpath="//input[@name='password']") WebElement txtPassword;
@FindBy(xpath="//input[@name='confirm']") WebElement txtConfirmPassword;
@FindBy(xpath="(//input[@name='newsletter'])[2]") WebElement subscribe;
@FindBy(xpath="//input[@name='agree']") WebElement radioPolicy;
@FindBy(xpath="//input[@value='Continue']") WebElement butContinue;
@FindBy(xpath="//div[@id='content']//h1")  public WebElement confirmMessage;

public void setFirstName(String fname)
{
	txtFirstName.sendKeys(fname);
}
public void setLastName(String lname)
{
	txtLastName.sendKeys(lname);
}
public void settxtEmail(String email)
{
	txtEmail.sendKeys(email);
}
public void setTelephone(String telphone)
{
	txtTelephone.sendKeys(telphone);
}
public String setPassword(String password)
{
	txtPassword.sendKeys(password);
	return password;
}
public void setConfirmPassword(String confirmPasword)
{
	txtConfirmPassword.sendKeys(confirmPasword);
	}
public void setSubscribe()
{
	subscribe.click();
}
public void setPolicy()
{
	radioPolicy.click();
}
public void clkcountinue()
{
	butContinue.click();
}



}  
