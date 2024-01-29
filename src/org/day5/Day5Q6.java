package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q6 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		WebDriver greensTech = new FirefoxDriver();
		
		greensTech.get("http://greenstech.in/selenium-course-content.html");
		
		greensTech.manage().window().maximize();
		
		WebElement courseBtn = greensTech.findElement(By.xpath("//div[text()='Courses ']"));
		
		
		Actions a = new Actions(greensTech);
		
		a.moveToElement(courseBtn).perform();
		
		
		WebElement softwareTestingBtn = greensTech.findElement(By.xpath("//div[@title='Software Testing']"));
		
		a.moveToElement(softwareTestingBtn).perform();
		
		WebElement seleniumTrainingBtn = greensTech.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		seleniumTrainingBtn.click();
		
		
		
		
		
}
}