package org.day10;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day10Q4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.greenstechnologys.com/python-training.html");

		driver.manage().window().maximize();

		WebElement seleniumTestTxt = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].click()",seleniumTestTxt);
		
		WebElement day10Task = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
		
		js.executeScript("arguments[0].click()",day10Task);
		
		js.executeScript("arguments[0].scrollIntoView(true)", day10Task);
		
		WebElement windowsHandlig = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
		js.executeScript("arguments[0].click()",windowsHandlig);
		
		String parentwindowId = driver.getWindowHandle();
		System.out.println(parentwindowId);
		
		Set<String> childsWindow = driver.getWindowHandles();
		System.out.println(childsWindow);
		List<String> l = new ArrayList<>();
		l.addAll(childsWindow);
		String child_no1 = l.get(1);
		driver.switchTo().window(child_no1);
		Thread.sleep(4000);

		WebElement findElement = driver.findElement(By.cssSelector("body>pre"));
		String text = findElement.getText();
		int lastIndexOf = text.lastIndexOf("QUESTIONS(Practical)");
		System.out.println(lastIndexOf);

		int lastIndexOf1 = text.lastIndexOf("QUESTION 2");
		System.out.println(lastIndexOf1);
		String substring = text.substring(697, 909);
		System.out.println(substring);
		
	}
}
