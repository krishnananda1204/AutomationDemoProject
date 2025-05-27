package testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base{

@Test
	public void manageNewsTest() throws IOException
	{
		   //String username="admin"; //credentials
		   //String password="admin"; //credentials
	
	      String username=ExcelUtilities.getStringData(1, 0, "loginpage"); 
	      String password=ExcelUtilities.getStringData(1, 1, "loginpage");
		  LoginPage loginpage=new LoginPage(driver);	//object create
		  loginpage.enterUsename(username);
		  loginpage.enterPassword(password);
		  loginpage.clickSignInButton();
		
		  //String news="Result Published";
		  String news=ExcelUtilities.getStringData(1, 0, "managenewspage");
		  ManageNewsPage managenewspage=new ManageNewsPage(driver);
		  managenewspage.clickManageNewsMoreInfo();
		  managenewspage.clickNewButton();
		  managenewspage.enterNews(news);
		  managenewspage.clickSaveButton();
		  boolean isNewsPageAvailable=managenewspage.isAlertDisplayed();  //assign in to a boolean variable
		  Assert.assertTrue(isNewsPageAvailable); //assertion code
		
	}
}
