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

public class day7Q13 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver snapdeal = new EdgeDriver();

		snapdeal.get("https://www.snapdeal.com/");

		snapdeal.manage().window().maximize();
		
		WebElement amazonSearch = snapdeal.findElement(By.id("inputValEnter"));

		amazonSearch.sendKeys("HP laptop");

		
		WebElement searchBtn = snapdeal.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		
		searchBtn.click();
		
		TakesScreenshot ts = (TakesScreenshot) snapdeal;

		File fp = ts.getScreenshotAs(OutputType.FILE);

		File fr = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass" 
		+ "\\screenshot\\images\\hplaptop.png");
		FileUtils.copyFile(fp, fr);
	}

}
