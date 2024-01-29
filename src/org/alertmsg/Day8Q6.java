package org.alertmsg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day8Q6 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\" + "SeleniumClass\\Drivers\\msedgedriver.exe");
		
		WebDriver sbibank = new EdgeDriver();
		
		sbibank.get("https://retail.onlinesbi.com/retail/login.htm");
		
		sbibank.manage().window().maximize();
		
		
		WebElement continueBtn = sbibank.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		continueBtn.click();
		
		
		WebElement loginBtn = sbibank.findElement(By.xpath("(//input[@class='btn btn-default'])[1]"));
		loginBtn.click();
		
		Alert alert = sbibank.switchTo().alert();
		
		alert.accept();
		
		
		

}
}