package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class day7Q11 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver flipkart = new EdgeDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();

		Actions a = new Actions(flipkart);

		WebElement flipadCloseBtn = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		flipadCloseBtn.click();

		Thread.sleep(2000);

		WebElement toysTxt = flipkart.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));

		a.moveToElement(toysTxt).perform();

		Thread.sleep(2000);

		WebElement babycareTxt = flipkart.findElement(By.xpath("//a[text()='Baby Care']"));

		babycareTxt.click();
		Thread.sleep(2000);
		WebElement babyTxt = flipkart.findElement(By.xpath("//span[text()='Baby & Kids']"));
		a.moveToElement(babyTxt).perform();

		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) flipkart;
		

		File fp = ts.getScreenshotAs(OutputType.FILE);
		
		File fr = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass"
				+ "\\screenshot\\images\\baby.png");
		FileUtils.copyFile(fp, fr);
	}

}