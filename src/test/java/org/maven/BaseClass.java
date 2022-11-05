package org.maven;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String bname) {
		if(bname.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		else if(bname.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		else if(bname.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		return driver;
}
	public static void urlLaunch(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	}
	public static void implicitlyWait(int a) 
	{
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
		}
	public static void sendkeys(WebElement e, String a) {
		e.sendKeys(a);
}
	public static void click(WebElement e) {
		e.click();
}
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
		}
	public static void quit() {
		driver.quit();
	}
	public static String getText(WebElement e) {
	String text = e.getText();
	return text;
	}
	public static String getAttribute(WebElement e){
		String attribute = e.getAttribute("value");
		return attribute;
		}
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	public static void dragAndDrop(WebElement src,WebElement dest) 
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	public static void selectByIndex(WebElement e,int a) {
		Select s=new Select(e);
		s.selectByIndex(a);
	}
	public static File Screenshot() {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File srcFile=tk.getScreenshotAs(OutputType.FILE);
		return srcFile;
		}
	
		
		
	

	}
	

