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

public class Day10Q2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.id("inputValEnter"));
		txtSearch.sendKeys("iphones 7");

		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btnSearch.click();

		Actions a = new Actions(driver);

		Thread.sleep(3000);

		WebElement caseIphone7 = driver
				.findElement(By.xpath("//p[text()='Apple iPhone 7 Plus Plain Cases Spectacular Ace - Black']"));

		a.contextClick(caseIphone7).perform();

		Robot r = new Robot();

		for (int i = 0; i < 10; i++) {

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);

		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		List<String> l = new ArrayList<>();
		l.addAll(allWindowHandles);
		String childTab = l.get(1);
		driver.switchTo().window(childTab);

		Thread.sleep(3000);
		WebElement btnAdd = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		btnAdd.click();
		WebElement payTxt = driver.findElement(By.xpath("//div[@class='you-pay']"));
		String text = payTxt.getText();
		System.out.println("Payable Amount" + text);
	}

}
