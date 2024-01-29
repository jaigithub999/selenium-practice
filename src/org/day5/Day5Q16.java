package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q16 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver amazon = new FirefoxDriver();
		
		amazon.get("https://www.amazon.in/");
		
		amazon.manage().window().maximize();
		
		WebElement accCreation = amazon.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		
		Actions a = new Actions(amazon);
		
		a.moveToElement(accCreation).perform();
		
		WebElement regBtn = amazon.findElement(By.xpath("(//a[text()='Start here.'])[2]"));
		regBtn.click();
		
		
		WebElement userName = amazon.findElement(By.id("ap_customer_name"));
		userName.sendKeys("jayaselvam@gmai");
		
		
		WebElement userName123 = amazon.findElement(By.id("ap_customer_name"));
		userName123.sendKeys("jayaselvam@gmai");
		
		WebElement phoneNumber = amazon.findElement(By.id("ap_phone_number"));
		phoneNumber.sendKeys("123456789");
		
		
		WebElement userEmail = amazon.findElement(By.id("ap_email"));
		userEmail.sendKeys("jai@gmail");
		
		Thread.sleep(3000);
		
		WebElement userpassKey = amazon.findElement(By.id("ap_password"));
		userpassKey.sendKeys("1234dtgvf");
		
		
		WebElement regContinueBtn = amazon.findElement(By.id("continue"));
		regContinueBtn.click();
		
		
}
}