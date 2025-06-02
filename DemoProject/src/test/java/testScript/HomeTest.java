package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.HomePage;
import utilities.ExcelUtilities;

public class HomeTest extends Base{
	@Test
  public void logoutTest() throws IOException
  {
	String username=ExcelUtilities.getStringData(1, 0, "loginpage"); 
    String password=ExcelUtilities.getStringData(1, 1, "loginpage");
	  LoginPage loginpage=new LoginPage(driver);
	  loginpage.enterUsename(username);
	  loginpage.enterPassword(password);
	  loginpage.clickSignInButton();
	  
	  HomePage logoutpage=new HomePage(driver);
	  logoutpage.clickProfileIcon();
	  logoutpage.clickLogoutButton();
	  boolean isSignInPageAvailable=logoutpage.isSignInButtonDisplayed();
	  Assert.assertTrue(isSignInPageAvailable);
}
}
