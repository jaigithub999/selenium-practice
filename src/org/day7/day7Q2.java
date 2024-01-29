package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day7Q2 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver toolsqa = new EdgeDriver();

		toolsqa.get("http://toolsqa.com/");

		toolsqa.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) toolsqa;

		WebElement recentArticleTxt = toolsqa.findElement(By.xpath("//a[text()='Latest Articles']"));

		js.executeScript("arguments[0].scrollIntoView(true)", recentArticleTxt);

	
	}

}

