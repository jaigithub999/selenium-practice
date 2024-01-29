package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q9 {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver amazon = new EdgeDriver();
		amazon.get("https://www.amazon.in/");

		amazon.manage().window().maximize();

		WebElement accCreation = amazon.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));

		Actions a = new Actions(amazon);

		a.moveToElement(accCreation).perform();

		WebElement signBtn = amazon.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));

		signBtn.click();

		Thread.sleep(3000);
		WebElement userNameTxtBox = amazon.findElement(By.xpath("//input[@type='email']"));

		a.sendKeys(userNameTxtBox, "jai.jayaselvam@gmail.com").perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);

		a.contextClick(userNameTxtBox).perform();

		for (int i = 0; i < 3; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
