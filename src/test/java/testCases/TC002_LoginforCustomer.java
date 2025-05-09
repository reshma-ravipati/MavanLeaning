package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC002_LoginforCustomer extends BaseClass {
	 @Test(groups= {"Master","Sanity","Regression"})
  public void Login() throws InterruptedException
	 {
		 
		 //homepage obj
		 HomePage hp=new HomePage(driver);
		 hp.clkMyAccount();
		 hp.clickLogin();
		 
		 //loginpage obj
		 
		 LoginPage lp=new LoginPage(driver);
		 lp.setEmailAddress("test123456789123@gmail.com");
		 lp.setPassword("Test@123");
		 Thread.sleep(2000);
		 lp.clickSubmit();
		
		 
		 
		 
  }
}
