package org.alertmsg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day8Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\" + "SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver demo = new EdgeDriver();

		demo.get("http://demo.automationtesting.in/Alerts.html");

		demo.manage().window().maximize();

		WebElement confirmAlertBtn = demo.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));

		confirmAlertBtn.click();

		WebElement clickBtnTxt = demo.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickBtnTxt.click();

		Alert alert = demo.switchTo().alert();
		
	
		alert.accept();
		
		Thread.sleep(3000);
		WebElement confirmAlertBtn1 = demo.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));

		confirmAlertBtn1.click();

		WebElement clickBtnTxt2 = demo.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickBtnTxt2.click();

		alert.dismiss();

	}

}
