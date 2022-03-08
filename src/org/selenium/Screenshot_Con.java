package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Con {
	
	 public static void main(String[] args) throws IOException, InterruptedException {
		
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
	        WebElement findElement = driver.findElement(By.id("email"));
	        findElement.sendKeys("Shafananisha17@gmail.com");
	        
	        WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
	        findElement2.sendKeys("shafana123");
	        
	        driver.findElement(By.xpath("//button[@value='1']")).click();
	         
	        
	        Thread.sleep(4000);
	        
	        
	        TakesScreenshot t=(TakesScreenshot) driver;
	        File screenshotAs = t.getScreenshotAs(OutputType.FILE);
	        File path=new File("C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\File\\sha.png");
	        FileUtils.copyFile(screenshotAs, path);
	        
	      
			
	        //TakesScreenshot ts=(TakesScreenshot) driver;
	        //File screenshot = ts.getScreenshotAs(OutputType.FILE);
	        //File path=new File("C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\File\\ni.png");
	        //FileUtils.copyFile(screenshot, path);

	 }

}
