package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;


public class AdminUsersPage {
   public WebDriver driver;
   PageUtility pageutility=new PageUtility();  //for usage in another class
	public AdminUsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminUsersMore_info_btn;
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement new_btn;
	@FindBy(xpath="//input[@id='username']") WebElement userName_txt;
	@FindBy(xpath="//input[@id='password']") WebElement password_txt;
	@FindBy(xpath="//select[@id='user_type']") WebElement userType_dropdown;
	@FindBy(xpath="//button[@name='Create']") WebElement save_button;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert_box;
	//@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']") WebElement redAlert;
	

	public void clickAdminUsersMoreInfo()
	{
		adminUsersMore_info_btn.click();
	}
	
	public void clickNewButton()
	{
		new_btn.click();
	}
	
	public void enterUsername(String username)
	{
		userName_txt.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		password_txt.sendKeys(password);
	}
	
	public void selectUserTypeDropdown(String value)
	{
		//Select select=new Select(userTypeDropdown);
		//select.selectByValue("Staff");
		//Select select=new Select(userTypeDropdown);
		//select.selectByIndex(1);
		//Select select=new Select(userTypeDropdown);
	    //select.selectByVisibleText(dropdown);
		
		//PageUtility pageutility=new PageUtility();
		pageutility.selectByVisibleText(userType_dropdown, value);  //webelement name ,value selected from the dropdown
		//pageutility.selectByIndex(userTypeDropdown, 2);
		//pageutility.selectByValue(userTypeDropdown, "Staff");
	}
	public void clickSaveButton()
	{
		save_button.click();
	}
	public boolean isAlertDisplayed()  
	{
		 return alert_box.isDisplayed();
	}
	
	/* public boolean isRedAlertDisplayed()  
	{
		 return alert.isDisplayed();
	}
	*/
	
}
