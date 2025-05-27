package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility { //for applying wait
	public static final int EXPLICIT_WAIT=10;
	public static final int IMPLICIT_WAIT=10;
	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	  public void waitForAlertIsPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.alertIsPresent());
	}
	  
	  public void waitForElementVisibility(WebDriver driver, WebElement element) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		    wait.until(ExpectedConditions.visibilityOf(element));
		}
	  
	  public void waitForElementInvisibility(WebDriver driver, WebElement element) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		    wait.until(ExpectedConditions.invisibilityOf(element));
		}
	  
	  public void waitFoPresenceOfElementLocated(WebDriver driver, By locator) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		    wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
}
