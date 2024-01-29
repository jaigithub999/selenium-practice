package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q12 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver homeDepot = new FirefoxDriver();
		
		homeDepot.get("https://www.homedepot.com/");
		
		homeDepot.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement allDepartment = homeDepot.findElement(By.xpath("//a[text()='All Departments']"));
		
		Actions a = new Actions(homeDepot);
		
		a.moveToElement(allDepartment).perform();
		
		Thread.sleep(1000);
		WebElement paintTxt = homeDepot.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		a.moveToElement(paintTxt).perform();
		
		Thread.sleep(1000);
		WebElement interiorPaintTxt = homeDepot.findElement(By.xpath("//a[text()='Interior Paint']"));
		a.moveToElement(interiorPaintTxt).perform();
		
		
		Thread.sleep(1000);
		WebElement ceilingPaintTxt = homeDepot.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		ceilingPaintTxt.click();
}
}