package org.day10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Day10Q8 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("inputValEnter"));
		searchBox.sendKeys("hand sanitizer");
		WebElement searchBtn = driver.findElement(By.xpath("//span[text()='Search']"));
		
		searchBtn.click();
		Thread.sleep(2000);
		WebElement sanitizer = driver.findElement(By.xpath("//p[contains(text(),'AYURVED MASTER - Antibacterial ')]"));
		
		Actions a = new Actions(driver);
		a.contextClick(sanitizer).perform();
		
		Robot r = new Robot();
		for (int i = 0; i <9; i++) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
		Set<String> chidsId = driver.getWindowHandles();
		System.out.println(chidsId);
		
		List<String> l = new ArrayList<>();
		
		l.addAll(chidsId);
		
		String child_no1 = l.get(1);
		driver.switchTo().window(child_no1);
		
		Thread.sleep(2000);
		WebElement addcartBtn = driver.findElement(By.xpath("//span[text()='add to cart']"));
		addcartBtn.click();
		
		
	}
	
}
