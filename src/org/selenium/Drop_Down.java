package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DB-L-202\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebElement a = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		a.click();
		Thread.sleep(3000);
		
		
		
		WebElement b = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		b.sendKeys("shafana");
		
		
		WebElement c = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		c.sendKeys("shafana123");
		
		
		WebElement d = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		d.sendKeys("8754715065");
		
		WebElement e = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		e.sendKeys("aisha123");
		
		
		WebElement f = driver.findElement(By.id("day"));
		Select r=new Select(f);
		//r.selectByIndex(20);
		//r.selectByValue("18");
		r.selectByVisibleText("5");
		
		WebElement g = driver.findElement(By.id("month"));
		Select q=new Select(g);
		//q.selectByIndex(0);
		//q.selectByValue("1");
		q.selectByVisibleText("Mar");
		
		
		WebElement h = driver.findElement(By.id("year"));
		Select p=new Select(h);
		//p.selectByIndex(3);
		//p.selectByValue("2000");
		p.selectByVisibleText("2017");
		
		


		WebElement female = driver.findElement(By.xpath("(//label[@class='_58mt'])[1]"));
		female.click();
		
		Thread.sleep(2000);
		
		

		WebElement male = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		male.click();
		
		Thread.sleep(2000);
		WebElement other = driver.findElement(By.xpath("(//label[@class='_58mt'])[3]"));
		other.click();
		
		WebElement terms = driver.findElement(By.linkText("Sign Up"));
		terms.click();
		
		
		
		}
	

}
