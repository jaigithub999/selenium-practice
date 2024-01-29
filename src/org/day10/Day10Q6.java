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

public class Day10Q6 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://greenstech.in/selenium-course-content.html");

		driver.manage().window().maximize();
		WebElement frameworkTxt = driver.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));
		Actions a = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", frameworkTxt);
		
		WebElement junitTxt = driver.findElement(By.xpath("//a[text()=' JUNIT']"));
		js.executeScript("arguments[0].scrollIntoView(true)", junitTxt);
		Thread.sleep(3000);
		a.contextClick(junitTxt).perform();
		Robot r = new Robot();
		for (int i = 0; i < 9; i++) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> chidsId = driver.getWindowHandles();
		List<String> l = new ArrayList<>();
		l.addAll(chidsId);
		String child_no1 = l.get(1);
		driver.switchTo().window(child_no1);
		Thread.sleep(4000);

		WebElement findElement = driver.findElement(By.cssSelector("body>pre"));
		String text = findElement.getText();
		int lastIndexOf = text.lastIndexOf("QUESTION 1");
		System.out.println(lastIndexOf);

		int lastIndexOf1 = text.lastIndexOf("QUESTION 2");
		System.out.println(lastIndexOf1);
		String substring = text.substring(1343, 1515);
		System.out.println(substring);
		}
	
}
