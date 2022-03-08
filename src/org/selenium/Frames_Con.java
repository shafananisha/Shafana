package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Con {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver frame=new ChromeDriver();
		
		frame.get("http://demo.automationtesting.in/Frames.html");
		frame.manage().window().maximize();
		
		
		WebElement findElement = frame.findElement(By.id("singleframe"));
		Thread.sleep(3000);
		frame.switchTo().frame(findElement);
		
		WebElement findElement2 = frame.findElement(By.xpath("//input[@type='text']"));
		findElement2.sendKeys("hello");
		
		
		frame.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		WebElement iframe = frame.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		
		WebElement element = frame.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		frame.switchTo().frame(element);
		
		Thread.sleep(3000);
		
		WebElement element2 = frame.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		frame.switchTo().frame(element2);
		Thread.sleep(3000);
		
		
		WebElement element3 = frame.findElement(By.xpath("(//input[@type='text'])"));
		
		element3.sendKeys("THANK YOU");
		
		
		
		
		
		
		
		
	}
	
	
}
