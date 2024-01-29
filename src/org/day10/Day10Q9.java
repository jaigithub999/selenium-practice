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


public class Day10Q9 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement addCloseBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		addCloseBtn.click();
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		searchBox.sendKeys("redmi");
		
		WebElement searchBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		searchBtn.click();
		
		Thread.sleep(2000);
		WebElement redmiPhone = driver.findElement(By.xpath("(//div[text()='REDMI A1+ (Light Green, 32 GB)'])[1]"));
		
		Actions a = new Actions(driver);
		Thread.sleep(1000);
//		WebElement powerBank = driver.findElement(By.xpath("(//div[text()='REDMI 10000 mAh Power Bank (10 W, Fast Charging)'])[1]"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		js.executeScript("arguments[0].scrollIntoView(true)",powerBank);
		Thread.sleep(1000);
		a.contextClick(redmiPhone).perform();

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
		String title = driver.getTitle();
		System.out.println("secound"+title);
		System.out.println(title);
		Thread.sleep(2000);
		WebElement priceBill = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = priceBill.getText();
		System.out.println("Payment to do pay:"+text);
	}
	
}
