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

public class Day6Q3 {

	public static void main(String[] args) throws AWTException {

	System.setProperty("webdriver,edge,driver", "C:\\Users\\jayaselvamjai"
			+ "\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");	
		
		WebDriver greens = new EdgeDriver();
		
		greens.get("http://greenstech.in/selenium-course-content.html");
		
		greens.manage().window().maximize();
		
		Actions a = new Actions(greens);
		
		
		WebElement interQuestion = greens.findElement(By.id("heading20"));
		
		a.moveToElement(interQuestion).perform();
		
		a.keyDown(interQuestion, Keys.ENTER).perform();
		
		WebElement ctsInterviewQuestion = greens.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		
		 a.moveToElement(ctsInterviewQuestion).perform();
		 
		 a.contextClick().perform();
		 
		 Robot rg = new Robot();

//		 for (int i = 0; i < 7; i++) {
			 
			 rg.keyPress(KeyEvent.VK_DOWN);
			 
			
//		}

		 rg.keyPress(KeyEvent.VK_ENTER);
		 rg.keyRelease(KeyEvent.VK_ENTER);
	}

}
