package org.day6;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q4 {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver,edge,driver",
				"C:\\Users\\jayaselvamjai" + "\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver greens = new EdgeDriver();

		greens.get("http://greenstech.in/selenium-course-content.html");

		greens.manage().window().maximize();

		Actions a = new Actions(greens);

		WebElement frameWork = greens.findElement(By.id("heading304"));

		a.moveToElement(frameWork).perform();

		a.keyDown(frameWork, Keys.ENTER).perform();

		Thread.sleep(3000);
		WebElement testing = greens.findElement(By.xpath("//a[text()=' TESTNG']"));

		a.keyDown(testing, Keys.ENTER).perform();

	}
}