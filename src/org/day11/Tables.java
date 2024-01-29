package org.day11;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tables {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));

		List<WebElement> cells = table.findElements(By.tagName("td"));
		WebElement cornerCell = cells.get(cells.size()- 1);
		System.out.println("Last Corner Last Cell \t"+cornerCell.getText());
		for (int i = 0; i < cells.size(); i++) {
			if (i%2==0) {
				
			WebElement cell = cells.get(i);
			System.out.println(cell.getText());
				
			}
		}
		
	}

}
