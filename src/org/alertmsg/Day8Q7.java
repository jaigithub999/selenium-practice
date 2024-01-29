package org.alertmsg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day8Q7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver bank = new EdgeDriver();

	
		bank.get("https://netbanking.hdfcbank.com/netbanking/"
				+ "?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");

		/*bank.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)bankcanara;
		
		js.executeScript(a
				*/

		bank.switchTo().frame("login_page");
		/*WebElement userName = bank.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys("jai@hdfc123");*/

		Thread.sleep(2000);
		WebElement continueBtn = bank.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));

		continueBtn.click();

		Alert alert = bank.switchTo().alert();

		alert.accept();
	}

}
