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

public class Day6Q11 {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver,edge,driver",
				"C:\\Users\\jayaselvamjai" + "\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver flipkart = new EdgeDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();

		WebElement adCloseBtn = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		adCloseBtn.click();
		WebElement flipsearchBox = flipkart
				.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		Actions a = new Actions(flipkart);

		a.sendKeys(flipsearchBox, "android mobile").keyDown(flipsearchBox, Keys.ENTER).build().perform();

		Thread.sleep(2000);
		WebElement mobileProduct = flipkart.findElement(By.xpath("//div[text()='POCO C50 (Royal Blue, 32 GB)']"));

		a.contextClick(mobileProduct).perform();

		Robot r = new Robot();

		for (int i = 0; i < 4; i++) {
			r.keyPress(KeyEvent.VK_DOWN);

			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_ENTER);
	}
}