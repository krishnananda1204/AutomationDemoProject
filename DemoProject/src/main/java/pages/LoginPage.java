package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 public WebDriver driver;
	    public LoginPage(WebDriver driver) {  //Parameterized constructor
			this.driver=driver; //current class instance variable 
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//input[@name='username']") WebElement usernameField;
		@FindBy(xpath="//input[@name='password']") WebElement passwordField;
		@FindBy(xpath="//button[@type='submit']") WebElement signinField;
		@FindBy(xpath="//p[text()='Dashboard']") WebElement dashboard;
		@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement redAlert;
		
		
		
		public LoginPage enterUsename(String username)
		{
			usernameField.sendKeys(username);
			return this;  //return this is use for stay in the current page
		}
		
		public LoginPage enterPassword(String password)
		{
			passwordField.sendKeys(password);
			return this;
		}
		
		public HomePage clickSignInButton()
		{
			signinField.click();
			return new HomePage(driver);  //navigate to another page use(return new HomePage(driver); )
		}
		
		public boolean isDashboardDisplayed()
		{
			return dashboard.isDisplayed();
		}
		public boolean isRedAlertDisplayed()
		{
			return redAlert.isDisplayed();
			
		}
	//extra red alert method create is displayed
}
