package org.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver web=new ChromeDriver();
		
		web.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		web.manage().window().maximize();
		
		System.out.println("******************multiple dropdown:true or false****************");
		
		WebElement multi = web.findElement(By.id("multi-select"));
		Select a=new Select(multi);
		boolean m = a.isMultiple();
		System.out.println("Multiple dropdown : " +m);
		
		
		System.out.println("******************get table printing statement****************");
		
		List<WebElement> opt = a.getOptions();
		for (WebElement we : opt) {
			System.out.println(we.getText());	
		}
		
		
		System.out.println("***********************get size*********************");
		
           int s = opt.size();
			System.out.println(s);
		
			for (int i = 0; i < s; i++) {
				if (i==1||i==3||i==6) {
					a.selectByIndex(i);
					
				}

				}
			
			
			System.out.println("***********************get selected options to print*********************");
			
			
		List<WebElement> allSelectedOptions = a.getAllSelectedOptions();
		for (WebElement w : allSelectedOptions) {
			System.out.println(w.getText());
			
		}
		
		
		System.out.println("***********************get 1st options********************");
		WebElement firstSelectedOption = a.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
			
			
			
			
			
			
			
	}
}
				
	
	
	
	
	
	
	
	
	

