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


public class Day10Q11 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(1000);
		WebElement addCloseBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		addCloseBtn.click();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchBox.sendKeys("hp laptop");
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchBtn.click();
		
		Thread.sleep(2000);
		
		WebElement hpLaptop = driver.findElement(By.xpath("//div[contains(text(),'fr4000TU Thin and Light Laptop')]"));
		Actions a = new Actions(driver);
		
		a.contextClick(hpLaptop).perform();

		Robot r = new Robot();
		for (int i = 0; i <10; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
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
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		WebElement priceBill = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = priceBill.getText();
		System.out.println("Payment to do pay:"+text);
	}
	
}
