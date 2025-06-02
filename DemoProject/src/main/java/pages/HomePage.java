package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
    public HomePage(WebDriver driver) {  
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@class='img-circle']") WebElement profileButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout' and @class='dropdown-item']") WebElement logoutButton;
	@FindBy(xpath="//button[@type='submit']") WebElement signInButton;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminUsersMore_info_btn;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='active nav-link']") WebElement manageNewsMoreInfo;

	public AdminUsersPage clickAdminUsersMoreInfo()
	{
		adminUsersMore_info_btn.click();
		return new AdminUsersPage(driver);
	}
	
	public ManageNewsPage clickManageNewsMoreInfo()
	{
		manageNewsMoreInfo.click();
		return new ManageNewsPage(driver);
	}
	public void clickProfileIcon()
	{
		profileButton.click();
	}
	
	public void clickLogoutButton()
	{
		logoutButton.click();
	}

	public boolean isSignInButtonDisplayed()
	{
		return signInButton.isDisplayed();
	}
	
}
