package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	@Test
  public void loginTest()
  {
	  String username="admin";   
	  String password="admin";
	  WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
	  user.sendKeys(username);
	  WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	  pass.sendKeys(password);
	  WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
	  signin.click();
	  WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']")); //validate the login page using the dashboard locate
	  boolean isHomePageAvailable=dashboard.isDisplayed(); 
	  //assign value to a boolean variable.here "isHomePageAvailable" is the variable.and check the dashboard is displayed
	  //if dashboard is displayed true else it returns false 
	  Assert.assertTrue(isHomePageAvailable); //if it true it goes to the homepage and  the testcase is passed
  }
}
