package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("https://demoqa.com/droppable/");
		web.manage().window().maximize();
		
		WebElement drag = web.findElement(By.id("draggable"));
		WebElement drop = web.findElement(By.id("droppable"));
		
		
		Actions ac=new Actions(web);
		
		ac.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
		
		
	}

}
