package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q18 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver flipkart = new FirefoxDriver();
		
		flipkart.get("https://www.flipkart.com/");
		
		flipkart.manage().window().maximize();
		Actions a = new Actions(flipkart);
		
		WebElement flipadCloseBtn = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		flipadCloseBtn.click();
		
		WebElement womensFashion = flipkart.findElement(By.xpath("//div[text()='Fashion']"));
		womensFashion.click();
		
		WebElement babyKidsOptions = flipkart.findElement(By.xpath("//span[text()='Baby & Kids']"));
		a.moveToElement(babyKidsOptions).perform();
		
		Thread.sleep(2000);
		
		WebElement rcToys = flipkart.findElement(By.xpath("//a[text()='Remote Control Toys']"));
		rcToys.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
	
	
	
}