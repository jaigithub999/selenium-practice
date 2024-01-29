package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q2 {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

			WebDriver google = new EdgeDriver();

			google.get("https://www.google.co.in/webhp");
			
			google.manage().window().maximize();
			

			google.manage().window();

			Actions g = new Actions(google);

			WebElement searchBox = google.findElement(By.xpath("//input[@jsaction='paste:puy29d;']"));
			
			g.sendKeys(searchBox, "Vel Murugan").perform();
			
			
			Robot rg = new Robot();
			
			rg.keyPress(KeyEvent.VK_CONTROL);
			rg.keyPress(KeyEvent.VK_A);
			Thread.sleep(1000);
			rg.keyRelease(KeyEvent.VK_CONTROL);
			rg.keyRelease(KeyEvent.VK_A);
			rg.keyPress(KeyEvent.VK_CONTROL);
			rg.keyPress(KeyEvent.VK_X);
			rg.keyRelease(KeyEvent.VK_CONTROL);
			rg.keyRelease(KeyEvent.VK_X);

	}
	
	

}
