package org.day7;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class day7Q10 {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver flipkart = new EdgeDriver();

		flipkart.get("https://www.flipkart.com/");

		flipkart.manage().window().maximize();

		Thread.sleep(2000);

		WebElement addClose = flipkart.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

		addClose.click();

		Actions a = new Actions(flipkart);

		WebElement f = flipkart.findElement(By.xpath("//div[text()='Fashion']"));

		a.moveToElement(f).perform();

		Thread.sleep(2000);

		WebElement searchwomen = flipkart.findElement(By.xpath("//a[text()='Women Ethnic']"));

		searchwomen.click();

		Thread.sleep(1000);
		WebElement searchwomen1 = flipkart.findElement(By.xpath("//span[text()='Women']"));

		a.moveToElement(searchwomen1).perform();
		 
		Thread.sleep(1000);
		
		TakesScreenshot t =(TakesScreenshot)flipkart;
		
		File fp = t.getScreenshotAs(OutputType.FILE);
		
		File fr = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass"
				+ "\\screenshot\\images\\womenscreenshot.png");
		FileUtils.copyFile(fp, fr);
		
		Actions s = new Actions(flipkart);
		

	}

}
