package org.day6;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q8 {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver,edge,driver",
				"C:\\Users\\jayaselvamjai" + "\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver flipkart = new EdgeDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();

		WebElement adCloseBtn = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		adCloseBtn.click();

		Actions a = new Actions(flipkart);

		WebElement logBtn = flipkart.findElement(By.xpath("//a[text()='Login']"));
		logBtn.click();
		
	

		WebElement userId = flipkart.findElement(By.xpath("(//input[@type='text'])[2]"));

		a.keyDown(userId, Keys.ENTER).sendKeys(userId, "jayaselvam").
		keyDown(userId, Keys.ENTER).build().perform();

	}
}