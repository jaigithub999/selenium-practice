package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Day10Q3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace"
				+ "\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		WebElement txtSearch = driver.findElement(By.id("headerSearch"));
		txtSearch.sendKeys("celling fan");

		WebElement btnSearch = driver.findElement(By.id("headerSearchButton"));
		btnSearch.click();

		Actions a = new Actions(driver);
		Thread.sleep(2000);
		WebElement kitchen = driver.findElement(By.id("small-kitchen-appliances"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView()", kitchen);
	
	WebElement cellingFan1 = driver.findElement(By.xpath("(//p[text()='Home Decorators Collection'])[2]"));
		a.contextClick(cellingFan1).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l = new ArrayList<>();
		l.addAll(windowHandles);
		String s = l.get(1);
		driver.switchTo().window(s);
		

		}
	}

