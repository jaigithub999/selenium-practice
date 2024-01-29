package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q13 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver homeDepot = new FirefoxDriver();
		
		homeDepot.get("https://www.snapdeal.com/");
		
		homeDepot.manage().window().maximize();
		
		WebElement snapDealMobile = homeDepot.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		
		Actions a = new Actions(homeDepot);
		
		a.moveToElement(snapDealMobile).perform();
		
		Thread.sleep(1000);
		WebElement snapDealMobileCase = homeDepot.findElement(By.xpath("//span[text()='Mobile Cases & Covers']"));
		
		snapDealMobileCase.click();
		
		WebElement newMobileCase = homeDepot.findElement(By.xpath("//p[text()='NBOX - Multicolor Silicon Printed Back Cover "
				+ "Compatible For Vivo Y16 ( Pack of 1 )']"));
		newMobileCase.click();
		
}
}