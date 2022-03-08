package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
        WebElement findElement = driver.findElement(By.id("email"));
        findElement.sendKeys("Shafananisha17@gmail.com");
        
        WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
        findElement2.sendKeys("shafana123");
        
        driver.findElement(By.xpath("//button[@value='1']")).click();
        
        
		
	}
	

}
