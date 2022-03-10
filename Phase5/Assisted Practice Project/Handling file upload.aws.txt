//Locating 'browse' button
 WebElement browse =driver.findElement(By.id("uploadfile"));
 //pass the path of the file to be uploaded using Sendkeys method
 browse.sendKeys("D:\\SoftwareTestingMaterial\\UploadFile.txt");


Handling File Upload by AutoIT script
	To open it go to Start->Autoit v3->Autoit window info
	Now drag the Finder tool box to the object in which you are interested

import java.io.IOException;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class AutoIt {
 
 private static WebDriver driver = null;
 
 public static void main(String[] args) throws IOException, InterruptedException {
 
     driver = new FirefoxDriver();
 
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
     driver.get("http://toolsqa.com/automation-practice-form");
 
     driver.findElement(By.id("photo")).click();
 
     Runtime.getRuntime().exec("D:\AutoIt\AutoItTest.exe");
 
     Thread.sleep(5000);
 
     driver.close();