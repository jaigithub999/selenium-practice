package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5Q9 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		

		WebDriver greensTech = new FirefoxDriver();

		greensTech.get("http://www.greenstechnologys.com/courses.html");

		greensTech.manage().window().maximize();
		Actions a = new Actions(greensTech);

		Thread.sleep(3000);
		
		WebElement adCloseBtn = greensTech.findElement(By.xpath("//button[text()='×']"));
		
		adCloseBtn.click();
		
		Thread.sleep(4000);
		WebElement couresTxt = greensTech.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		a.moveToElement(couresTxt).perform();
	
		Thread.sleep(2000);
		
		WebElement rpaTraining = greensTech.findElement(By.xpath("(//a[text()='Robotic Process Automation '])[1]"));
		a.moveToElement(rpaTraining).perform();
		
		WebElement bluePrismTraining = greensTech.findElement(By.xpath("//span[text()='Blue Prism Training']"));
		bluePrismTraining.click();
		
		
		
	}

	
	
	
}
