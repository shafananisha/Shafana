package org.selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollUp_Down {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("https://www.ajio.com/");
		web.manage().window().maximize();
		
		WebElement scroll = web.findElement(By.xpath("//span[@class='ic-pikup']"));
		
		JavascriptExecutor j=(JavascriptExecutor) web;
		j.executeScript("arguments[0].scrollIntoView();", scroll);
		
		
		
		j.executeScript("window.scrollBy(0,-1000)");
		j.executeScript("window.scrollBy(0,-1000)");
		j.executeScript("window.scrollBy(0,-1000)");
		
		Thread.sleep(2000);
		
		j.executeScript("window.scrollBy(0,+1000)");	
		j.executeScript("window.scrollBy(0,+1000)");	
		
		
	
		
		//j.executeScript("window.scrollTo(0, document.body.scrollHeight");
		//j.executeScript("window.scrollTo(0, document.body.scrollTop");
		
		
				
	}
}
