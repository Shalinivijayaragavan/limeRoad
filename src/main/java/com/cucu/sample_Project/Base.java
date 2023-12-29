package com.cucu.sample_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public static WebDriver launchUrl(String url) {
		driver.get(url);
		return driver;
		
	}
	
	public static void click_Method(WebElement Element)

	{
		
		if(Element.isDisplayed()) {
			Element.click();
		}
	}
		public static void send_Method(WebElement Element1, String value)

		{
			
			if(Element1.isDisplayed()) {
				Element1.sendKeys(value);
			}
		}
			
			public static void SS_Method(String File) throws IOException

			{
				TakesScreenshot scrShot =((TakesScreenshot)driver);
				File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
				File DestFile=new File("E:/JAVA/Nyyka/src/screen_Shot/+s1.png");
				FileHandler.copy(SrcFile, DestFile);
				
				}
	
	public static void closeBrowser() {
		driver.close();
	}
	
	public static void terminateBrowser() {
		driver.quit();
	}
	
	public static void scrollbyvalue(int xaxis, int yaxis) {
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	
	public static void simplealert() {
		driver.switchTo().alert().accept();
	
	}
	
	public static void confrimalert(String option) {
		
		if(option.equals("accept")) {
			driver.switchTo().alert().accept();
		}
		else if(option.equals("dismiss")){
			driver.switchTo().alert().dismiss();
		}
	}
	
	public static void promptalert(String input, String option) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("input");
		if(option.equals("accept")) {
			driver.switchTo().alert().accept();
		}
		
		else if(option.equals("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
	public static void action(WebElement element)	{
		
		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(element).perform();
	}
	
	public static void implict() {  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void Explict(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	
	public static void scrollByElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
		
		
	}
	

