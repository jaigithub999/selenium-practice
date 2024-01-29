package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q7 {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver,edge,driver",
				"C:\\Users\\jayaselvamjai" + "\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver greens = new EdgeDriver();

		greens.get("http://greenstech.in/selenium-course-content.html");

		greens.manage().window().maximize();

		Actions a = new Actions(greens);

		WebElement seleniumTestPaper = greens.findElement(By.id("heading303"));

		a.moveToElement(seleniumTestPaper).perform();
		a.keyDown(seleniumTestPaper, Keys.ENTER).perform();
		
		Robot r = new Robot();
	
		Thread.sleep(3000);
		WebElement day6robot = greens.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));

		a.moveToElement(day6robot).contextClick().perform();

		for (int i = 0; i <8; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
}
}