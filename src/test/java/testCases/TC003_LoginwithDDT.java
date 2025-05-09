package testCases;

import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginwithDDT extends BaseClass {
	
	
  @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups= {"Master","Sanity","Regression"})
  public void verify_loginDDT(String email,String pass,String exp) {
	  logger.info("***Start of the TC003_LoginwithDDT****");
	  //Homepage
	  HomePage hp=new HomePage(driver);
	  hp.clkMyAccount();
	  hp.clickLogin();
	  
	  
	  //LoginPage 
	  LoginPage lp=new LoginPage(driver);
	  lp.setEmailAddress(email);
	  lp.setPassword(pass);
	  lp.clickSubmit();

	  System.out.println(driver.getTitle());
	 String title =driver.getTitle();
	  
	 //MyAccountPage
	  MyAccountPage mp=new MyAccountPage(driver);
	  
	  if (title.equals("My Account"))
	  {
		 
		  mp.clickLogout();
		  Assert.assertTrue(true);
	  }
	  else
	  {
		  Assert.assertTrue(false);
	  }
	  
	  
	 
	  
	//  if()
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
