package org.day9;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class Day9Q2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://demoqa.com/automation-practice-form/");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement f = driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].click()",f);
		
		
		WebElement submitBtn = driver.findElement(By.xpath("//button[text()='Submit']"));
		js.executeScript("arguments[0].scrollIntoView()", submitBtn);
		
		WebElement stateAndCity = driver.findElement(By.xpath("//div[text()='Select State']"));
		
		stateAndCity.click();
		Robot r = new Robot();
				
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement findElement = driver.findElement(By.xpath("//div[text()='NCR']"));
			String text = findElement.getText();
			System.out.println("Even Option State:"+text);
			
			WebElement cityBox = driver.findElement(By.xpath("//div[text()='Select City']"));
			cityBox.click();
		
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			WebElement findElement2 = driver.findElement(By.xpath("//div[text()='Delhi']"));
			String text2 = findElement2.getText();
			System.out.println("Even Option City :"+text2);

}
}