package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class day7Q9 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver flipkart = new EdgeDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();

		Thread.sleep(2000);

		WebElement addClose = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		addClose.click();

		WebElement searchBox = flipkart.findElement(By.xpath("//input[@title='Search for products, brands and more']"));

		searchBox.sendKeys("iphone");

		Actions a = new Actions(flipkart);

		a.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

		TakesScreenshot ts = ((TakesScreenshot) flipkart);

		Thread.sleep(1000);

		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File(
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\screenshot\\images\\iphone1.png");

		FileUtils.copyFile(src, dest);

	}

}
