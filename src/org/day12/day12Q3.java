package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class day12Q3 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace" + "\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver greens = new EdgeDriver();

		greens.get("http://greenstech.in/selenium-course-content.html");

		greens.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) greens;

		Thread.sleep(1000);
		WebElement frameTxt = greens.findElement(By.xpath("(//h2[@class='mb-0'])[7]"));

		js.executeScript("arguments[0].scrollIntoView(true)", frameTxt);


	}

}

