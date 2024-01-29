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

public class day7Q12 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver amazon = new EdgeDriver();

		amazon.get("https://www.amazon.in/");

		amazon.manage().window().maximize();

		

		WebElement amazonSearch = amazon.findElement(By.id("twotabsearchtextbox"));

		amazonSearch.sendKeys("motorolo");

		WebElement searchBtn = amazon.findElement(By.id("nav-search-submit-button"));
		searchBtn.click();
		
		TakesScreenshot ts = (TakesScreenshot) amazon;

		File fp = ts.getScreenshotAs(OutputType.FILE);

		File fr = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass" 
		+ "\\screenshot\\images\\motorola.png");
		FileUtils.copyFile(fp, fr);
	}

}
