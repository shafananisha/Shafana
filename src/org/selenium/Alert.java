package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("http://demo.automationtesting.in/Alerts.html");
		web.manage().window().maximize();
	
		
		WebElement findelement = web.findElement(By.xpath("//button[@onclick='alertbox()']"));
		findelement.click();
		
		
		
		web.switchTo().alert().accept();
		
		WebElement findElement2 = web.findElement(By.linkText("Alert with OK & Cancel"));
		findElement2.click();
		
		WebElement findElement3 = web.findElement(By.xpath("//button[@class='btn btn-primary']"));
		findElement3.click();
		
		
		web.switchTo().alert().dismiss();
		
		
		WebElement findElement4 = web.findElement(By.linkText("Alert with Textbox"));
		findElement4.click();
	Thread.sleep(2000);
		
		WebElement findElement5 = web.findElement(By.xpath("//button[@class='btn btn-info']"));
		findElement5.click();
		
		
		Thread.sleep(2000);
		org.openqa.selenium.Alert a = web.switchTo().alert();
		a.sendKeys("shafana");
		a.accept();
		
		
	}	
	}
