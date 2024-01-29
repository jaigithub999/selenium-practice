package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6Q10 {
	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver snapDeal = new EdgeDriver();
		
		snapDeal.get("https://www.snapdeal.com/offers/");
		
		snapDeal.manage().window().maximize();
		
		WebElement snapDealMobile = snapDeal.findElement(By.id("inputValEnter"));
		
		Actions a = new Actions(snapDeal);
		
		a.moveToElement(snapDealMobile).perform();
		a.sendKeys(snapDealMobile, "quirky").perform();
		
		
		WebElement snapSearchKey = snapDeal.findElement(By.xpath("//span[@class='searchTextSpan']"));
		a.keyDown(snapSearchKey, Keys.ENTER).perform();
		
		WebElement snapQuirky = snapDeal.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
		a.contextClick(snapQuirky).perform();
		
		Robot r = new Robot();
		
		
		
		for (int i = 0; i < 15; i++) {
			
			r.keyPress(KeyEvent.VK_UP);
			
			r.keyRelease(KeyEvent.VK_UP);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
}
}