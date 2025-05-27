package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {

	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException {  //getScreenShot method call in base class -after method
 		TakesScreenshot scrShot = (TakesScreenshot) driver; 
 		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);  //call getScreenShot as a method create image file
 		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date()); 
 		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");  //where the folder is generated
 		if (!f1.exists()) { 
 			f1.mkdirs();   //if the directory is not exist create a new directory
 		}
String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp+ ".png";  
 		File finalDestination = new File(destination); 
 		FileHandler.copy(screenShot, finalDestination);  //copy method is use copy a file in to one location into another location, FileHandler is method
 	}
}
