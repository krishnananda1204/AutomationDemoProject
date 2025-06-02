package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class AdminUsersTest extends Base{
	AdminUsersPage adminuserspage;  //object create the adminuserspage (globally declare)
	HomePage homepage;  //homepage object create
	@Test(retryAnalyzer=retry.Retry_class.class)    //for retry  (pacakagename.classname.class extension)
	public void adminUsersTest() throws IOException
	{
		   //String username="admin"; //credentials
		  // String password="admin"; //credentials
	    String username=ExcelUtilities.getStringData(1, 0, "loginpage");
	     String password=ExcelUtilities.getStringData(1, 1, "loginpage");
	     LoginPage loginpage=new LoginPage(driver);	//object create
		  loginpage.enterUsename(username).enterPassword(password);
		  //loginpage.enterPassword(password);
		  homepage=loginpage.clickSignInButton();
	 
	 //faker utility ->it randomly generate data.instance 
	 FakerUtility fakerutility=new FakerUtility();
	 String username_AdminUserTest= fakerutility.creatARandomFirstName();
	 String password_AdminUserTest= fakerutility.creatARandomLastName();
		  
		  
		   //String username_AdminUserTest="reshmaroy";
		   //String password_AdminUserTest="reshmaroy";
		  
		 //String username_AdminUserTest=ExcelUtilities.getStringData(1, 0, "adminuserspage");
		 //String password_AdminUserTest=ExcelUtilities.getStringData(1, 1, "adminuserspage");
	 
		 String userType=ExcelUtilities.getStringData(2,2, "adminuserspage");
		//AdminUsersPage adminuserspage=new AdminUsersPage(driver);
		//adminuserspage.clickAdminUsersMoreInfo();
		 adminuserspage=homepage.clickAdminUsersMoreInfo();
		adminuserspage.clickNewButton().enterUsername(username_AdminUserTest).enterPassword(password_AdminUserTest).selectUserTypeDropdown(userType).selectUserTypeDropdown(userType).clickSaveButton();
		//adminuserspage.enterUsername(username_AdminUserTest);
		//adminuserspage.enterPassword(password_AdminUserTest);
		//adminuserspage.selectUserTypeDropdown(userType);
		//adminuserspage.clickSaveButton();
		boolean isAdminUsersPageAvailable=adminuserspage.isAlertDisplayed(); 
		Assert.assertTrue(isAdminUsersPageAvailable);
		//boolean isAdminUsersPageNotAvailable=adminuserspage.isRedAlertDisplayed(); 
		//Assert.assertTrue(isAdminUsersPageNotAvailable);
	}
}
