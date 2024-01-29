package org.day11;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day11Q3 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://demo.guru99.com/test/write-xpath-table.html");

		driver.manage().window().maximize();
		
		List<WebElement> tables = driver.findElements(By.xpath("//table[@border='l']"));
		System.out.println("Number of Table: "+tables.size());
		
		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> noOfRows = table.findElements(By.tagName("tr"));
		int size = noOfRows.size();
		System.out.println("Number Of Rows: "+size);
		
		driver.quit();
		
		
		
		
		
		
}
}