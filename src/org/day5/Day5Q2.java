package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q2 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver amazon = new FirefoxDriver();
		
		amazon.get("http://www.amazon.in");
		
		amazon.manage().window().maximize();
		
		Actions a = new Actions(amazon);
		
		
		WebElement primeBtn = amazon.findElement(By.xpath("//span[text()='Prime']"));
		
		a.moveToElement(primeBtn).perform();
		
		
		Thread.sleep(3000);
		WebElement primeBtn1 = amazon.findElement(By.id("multiasins-img-link"));
		
		primeBtn1.click();
		
}
}