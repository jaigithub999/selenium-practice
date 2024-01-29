package org.day7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day7Q6 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" 
		+ "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver greens = new EdgeDriver();

		greens.get("http://greenstech.in/selenium-course-content.html");

		greens.manage().window().maximize();

		WebElement trends2020 = greens.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)greens;
		
		js.executeScript("arguments[0].scrollIntoView(true)",trends2020 );
		
		TakesScreenshot ts =((TakesScreenshot)greens);
		
		Thread.sleep(1000);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\"
				+ "screenshot\\images\\trends2020.png");
		
		FileUtils.copyFile(src, dest);



	
	}

}

