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

public class Day10Q5 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.greenstechnologys.com/");

		driver.manage().window().maximize();
		WebElement courseTxt = driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a = new Actions(driver);
		a.moveToElement(courseTxt).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement pythonCourse = driver.findElement(By.xpath("(//span[text()='Python'])[1]"));
		js.executeScript("arguments[0].click()", pythonCourse);

		Thread.sleep(3000);
		WebElement exploreCurriculamBtn = driver.findElement(By.xpath("(//button[@class='btn'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", exploreCurriculamBtn);
		// WebElement exploreCurriculamBtn =
		// driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
		a.contextClick(exploreCurriculamBtn).perform();
		Robot r = new Robot();
		for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		Set<String> childsWindowId = driver.getWindowHandles();
		System.out.println(childsWindowId);
		List<String> l = new ArrayList<>();
		l.addAll(childsWindowId);

		String childId = l.get(1);
		System.out.println(childId);
		driver.switchTo().window(childId);
		
		

	}
}
