package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Con {
	
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	
	WebDriver web=new ChromeDriver();
	
	web.get("https://www.w3schools.com/html/html_tables.asp");
	web.manage().window().maximize();
	
	
	System.out.println("***********************full table*********************");
	
	
	List<WebElement> table = web.findElements(By.id("customers"));
	
	
	for (WebElement element : table) {
	System.out.println(element.getText());
	}
	
	System.out.println("****************************one row*****************");
	
	List<WebElement> table1 = web.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]"));
	for (WebElement element2 : table1) {
		System.out.println(element2.getText());
		
		
		
		
		
	}
	
	System.out.println("****************************one word***************");
	
	WebElement word = web.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]"));
	System.out.println(word.getText());	
}
	
	
}

	


