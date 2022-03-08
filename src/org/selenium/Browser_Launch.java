package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe" );
		
		WebDriver name=new ChromeDriver();
		
		name.get("https://www.instagram.com/");
		name.manage().window().maximize();
	    name.navigate().to("https://www.flipkart.com/");
	    String title = name.getTitle();
	    System.out.println(title);
	    String currentUrl = name.getCurrentUrl();
	    System.out.println(currentUrl);
	    name.close();
	    name.quit();
	} 

}
