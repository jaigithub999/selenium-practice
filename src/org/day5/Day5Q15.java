package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q15 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver amazon = new FirefoxDriver();
		
		amazon.get("https://www.amazon.in/");
		
		amazon.manage().window().maximize();
		
		WebElement accCreation = amazon.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		
		Actions a = new Actions(amazon);
		
		a.moveToElement(accCreation).perform();
		
		
		WebElement signBtn = amazon.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
		signBtn.click();
		
		
		WebElement regBox = amazon.findElement(By.xpath("//input[@type='email']"));
		regBox.sendKeys("jai.jayaselvam@gmail.com");
		
		
		WebElement regBtn = amazon.findElement(By.id("continue"));
		regBtn.click();
		
}
}