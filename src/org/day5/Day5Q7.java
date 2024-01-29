package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q7 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver greensTech = new FirefoxDriver();
		
		greensTech.get("http://greenstech.in/selenium-course-content.html");
		
		greensTech.manage().window().maximize();
		
		WebElement courseBtn = greensTech.findElement(By.xpath("//div[text()='Courses ']"));
		
		
		Actions a = new Actions(greensTech);
		
		a.moveToElement(courseBtn).perform();
		
		WebElement oracleTxt = greensTech.findElement(By.xpath("//span[text()='Oracle (48)']"));
		
		a.moveToElement(oracleTxt).perform();
		
		WebElement viewAllCourseTxt = greensTech.findElement(By.xpath("(//a[text()='View All Courses'])[3]"));
		viewAllCourseTxt.click();
		
		Thread.sleep(5000);
		
		WebElement adCloseBtn = greensTech.findElement(By.xpath("//button[text()='×']"));
		
		adCloseBtn.click();
		
		Thread.sleep(2000);
		
		WebElement couresTxt = greensTech.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		a.moveToElement(couresTxt);
	
		WebElement sqlTraining = greensTech.findElement(By.xpath("//span[text()='MS SQL Server DBA Training']"));
		sqlTraining.click();
		
		
		
		
}
}