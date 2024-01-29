package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day12Q2 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver toolsqa = new EdgeDriver();

		toolsqa.get("http://toolsqa.com/");

		toolsqa.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) toolsqa;

		WebElement youtubeTxt = toolsqa.findElement(By.xpath("//span[text()='Youtube']"));

		js.executeScript("arguments[0].scrollIntoView(true)", youtubeTxt);

		Thread.sleep(1000);
		
		WebElement logoTxt = toolsqa.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));

		js.executeScript("arguments[0].scrollIntoView(false)", logoTxt);

	}

}

