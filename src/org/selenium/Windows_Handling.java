package org.selenium;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
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
	
	 WebElement  stu= web.findElement(By.xpath("//a[@data-index='1']"));
		Actions b=new Actions(web);
			a.contextClick(stu).perform();
		
			Robot g=new Robot();
		
		g.keyPress(KeyEvent.VK_DOWN);
		g.keyRelease(KeyEvent.VK_DOWN);
		g.keyPress(KeyEvent.VK_ENTER);
		
	Set<String> windowH = web.getWindowHandles();
	
	
	ArrayList<String> s=new ArrayList<String>(windowH);
	String url = web.switchTo().window(s.get(1)).getTitle();
	System.out.println(url);
	
	
	}
	
		}

