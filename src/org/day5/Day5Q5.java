package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q5 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver shopclues = new FirefoxDriver();
		
		shopclues.get("https://www.shopclues.com/wholesale.html");
		
		shopclues.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		WebElement sportsMore = shopclues.findElement(By.xpath("//a[text()='Sports & More']"));
		
		
		Actions a = new Actions(shopclues);
		
		a.moveToElement(sportsMore).perform();
		
		
		Thread.sleep(5000);
		WebElement WeightGainer = shopclues.findElement(By.xpath("//a[text()='Weight Gainers']"));
		
		WeightGainer.click();
		
		
		
		
		
}
}
