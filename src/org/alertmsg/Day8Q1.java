package org.alertmsg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day8Q1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\" + "SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver demo = new EdgeDriver();

		demo.get("http://demo.automationtesting.in/Alerts.html");

		demo.manage().window().maximize();

	
		WebElement clickBtnTxt = demo.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickBtnTxt.click();

		Alert alert = demo.switchTo().alert();
		
	
		alert.accept();
}
}