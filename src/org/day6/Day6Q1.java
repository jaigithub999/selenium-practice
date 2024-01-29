package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver facebook = new EdgeDriver();

		facebook.get("https://www.facebook.com/");

		facebook.manage().window();

		Actions f = new Actions(facebook);

		WebElement userId = facebook.findElement(By.xpath("//input[@type='text']"));
		f.sendKeys(userId, "email").perform();

		Robot rf = new Robot();
		rf.keyPress(KeyEvent.VK_CONTROL);
		rf.keyPress(KeyEvent.VK_A);

		rf.keyPress(KeyEvent.VK_CONTROL);
		rf.keyPress(KeyEvent.VK_C);
		rf.keyRelease(KeyEvent.VK_CONTROL);
		rf.keyRelease(KeyEvent.VK_C);

		rf.keyPress(KeyEvent.VK_TAB);
		rf.keyRelease(KeyEvent.VK_TAB);

		rf.keyPress(KeyEvent.VK_CONTROL);
		rf.keyPress(KeyEvent.VK_V);

		rf.keyRelease(KeyEvent.VK_CONTROL);
		rf.keyRelease(KeyEvent.VK_V);
	}

}
