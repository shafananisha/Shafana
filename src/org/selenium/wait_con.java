package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_con {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		 
		 WebDriver web=new ChromeDriver();
		 
		 web.get("https://www.myntra.com/shop/men");
		 web.manage().window().maximize();

		 		 
		 WebElement toddeals = web.findElement(By.xpath("(//a[@data-index='0'][1])"));
		Actions a=new Actions(web);
			a.contextClick(toddeals).perform();
			
		
			Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		web.manage().timeouts().implicitlyWait(6 ,TimeUnit.SECONDS);
		web.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));//implicit wait
		
		
		

		 WebDriverWait wait= new WebDriverWait(web, 20);
		 wait.until(ExpectedConditions.visibilityOf(toddeals));//explicit wait
		 
		 Wait w= new FluentWait(web).withTimeout(Duration.ofSeconds(30)).pollingEvery
				 (Duration.ofSeconds(3)).ignoring(Exception.class);//fluent wait
		 
		 
		 
		
		 WebElement  stu= web.findElement(By.xpath("//a[@data-index='1']"));
			Actions b=new Actions(web);
				a.contextClick(stu).perform();
			
				Robot g=new Robot();
			
			g.keyPress(KeyEvent.VK_DOWN);
			g.keyRelease(KeyEvent.VK_DOWN);
			g.keyPress(KeyEvent.VK_ENTER);
			
		
			}

}
