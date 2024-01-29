package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q11 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver homeDepot = new FirefoxDriver();
		
		homeDepot.get("https://www.homedepot.com/");
		
		homeDepot.manage().window().maximize();
		
		
		WebElement allDepartment = homeDepot.findElement(By.xpath("//a[text()='All Departments']"));
		
		
		Actions a = new Actions(homeDepot);
		
		a.moveToElement(allDepartment).perform();
		
		
		Thread.sleep(1000);
		
		WebElement heatingAndCoolingTxt = homeDepot.findElement(By.xpath("(//a[text()='Heating & Cooling'])[1]"));
		
		a.moveToElement(heatingAndCoolingTxt).perform();
		
		Thread.sleep(1000);
		WebElement airConditioners = homeDepot.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		
		a.moveToElement(airConditioners).perform();
		
		Thread.sleep(1000);
		
		WebElement poratableAirCond = homeDepot.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		
		a.moveToElement(poratableAirCond).perform();
		
		poratableAirCond.click();
}
}