package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Day10Q1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace"
				+ "\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("www.amazon.com/");

	/*	driver.manage().window().maximize();

		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphones X");

		WebElement btnSearch = driver.findElement(By.id("nav-search-submit-button"));
		btnSearch.click();

		Actions a = new Actions(driver);

		WebElement iphoneX = driver.findElement(
				By.xpath("//span[text()='Apple iPhone X, " + "64GB, Space Gray - Fully Unlocked (Renewed Premium)']"));

		a.contextClick(iphoneX).perform();

		Robot r = new Robot();

		for (int i = 0; i < 9; i++) {

			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		List<String> l = new ArrayList<>();
		
		 l.addAll(allWindowHandles);
		 String s = l.get(1);
	
		driver.switchTo().window(s);
		
		
			Thread.sleep(3000);
			WebElement txt = driver.findElement(By.xpath("//span[text()='    Currently unavailable.   ']"));
			String text = txt.getText();
			System.out.println(text);
		
		
			

		}
*/
	
	}}
