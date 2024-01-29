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

public class day7Q7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" 
		+ "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver greens = new EdgeDriver();

		greens.get("http://greenstech.in/selenium-course-content.html");

		greens.manage().window().maximize();

		WebElement interviewQuestionTxt = greens.findElement(By.xpath("(//i[@class='fas fa-plus'])[1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)greens;
		
		interviewQuestionTxt.click();
		
		js.executeScript("arguments[0].scrollIntoView(true)",interviewQuestionTxt );
		
		TakesScreenshot ts =((TakesScreenshot)greens);
		
		Thread.sleep(1000);
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\"
				+ "screenshot\\images\\interviewQuestion.png");
		
		FileUtils.copyFile(src, dest);



	
	}

}

