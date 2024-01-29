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

public class day7Q1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver greens = new EdgeDriver();

		greens.get("http://www.greenstechnologys.com/");

		greens.manage().window().maximize();


		Thread.sleep(2000);
		
		WebElement addBtn = greens.findElement(By.xpath("//button[@type='button']"));
		
		addBtn.click();
		
		
		TakesScreenshot ts =((TakesScreenshot)greens);
		
		Thread.sleep(3000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\screenshot\\images\\greens.png");
		
		FileUtils.copyFile(src, dest);
		



	
	}

}

