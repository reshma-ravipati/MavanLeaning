package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegisterTest extends BaseClass {
	
	
  @Test(groups= {"Sanity" ,"Master"})
  public void verify_account_registeration() throws InterruptedException
  {
	  logger.info("*****Test Started*****");
	  HomePage hp=new HomePage(driver);
	  hp.clkMyAccount();
	  hp.clkRegister();
	  
	  AccountRegistrationPage accReg=new AccountRegistrationPage(driver);
	  logger.info("****Filling the form********");
	  accReg.setFirstName(randomString());
	  accReg.setLastName(randomString());
	  accReg.settxtEmail(randomString() + "@gmail.com");
	  accReg.setTelephone(randomNumeric());
	 String password= accReg.setPassword(randomString());
	 Thread.sleep(2000);
	  
	  accReg.setConfirmPassword(password);
	  accReg.setSubscribe();
	  accReg.setPolicy();
	  accReg.clkcountinue();
	  Thread.sleep(5000);
//	WebElement confmsg= driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));
//	  Assert.assertEquals(confmsg,"Your Account Has Been Created!");
  }
}
