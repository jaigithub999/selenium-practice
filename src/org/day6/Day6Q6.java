package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q6 {
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver,edge,driver",
				"C:\\Users\\jayaselvamjai" + "\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");
		
		WebDriver greens = new EdgeDriver();
		
		greens.get("http://greenstech.in/selenium-course-content.html");
		
		greens.manage().window().maximize();
		
		Actions a = new Actions(greens);
		
		WebElement modelResume = greens.findElement(By.xpath("//a[text()='RPA']"));
		
		
		a.contextClick(modelResume).perform();
		Robot r = new Robot();
		
		for (int i = 0; i < 8; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	


}
