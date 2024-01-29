package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DayQ10 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		
		

		WebDriver greensTech = new FirefoxDriver();

		greensTech.get("http://www.greenstechnologys.com/courses.html");

		greensTech.manage().window().maximize();
		Actions a = new Actions(greensTech);

		Thread.sleep(3000);
		
		WebElement adCloseBtn = greensTech.findElement(By.xpath("//button[@class='close' and @type='button']"));
		
		adCloseBtn.click();
		
		Thread.sleep(2000);
		WebElement couresTxt = greensTech.findElement(By.xpath("(//a[text()='Courses '])[1]"));
		a.moveToElement(couresTxt).perform();
		
		
		WebElement dataWareHoushing = greensTech.findElement(By.xpath("//a[text()='Data Warehousing Training '][1]"));
		a.moveToElement(dataWareHoushing).perform();
		
		
		
		
		
		
		
}
}