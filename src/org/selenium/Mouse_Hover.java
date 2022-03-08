package org.selenium;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver mouse=new ChromeDriver();
		
		mouse.get("https://www.amazon.in/");
		mouse.manage().window().maximize();
		
		  // mouse action and right click
	        
		
		WebElement hello = mouse.findElement(By.xpath("//a[@data-nav-role='signin']"));
		
		
		Actions ac= new Actions(mouse);
		ac.moveToElement(hello).perform();
		
		Thread.sleep(2000);
		
		WebElement mobiles = mouse.findElement(By.xpath("//a[@class='nav-a  ']"));
		Actions a=new Actions(mouse);
		
		a.contextClick(mobiles).perform();
		
		//keyboard actions
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);//Vk vitrual key
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
	
		
	
			
	}

}
