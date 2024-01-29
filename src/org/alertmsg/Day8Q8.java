package org.alertmsg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Day8Q8 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\" + "SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver bank = new EdgeDriver();

		bank.get("https://infinity.icicibank.com/corp/AuthenticationController?"
				+ "FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y"
				+ "&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

		bank.manage().window().maximize();

		
		WebElement continueBtn = bank.findElement(By.id("user-id-goahead"));

		continueBtn.click();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		WebElement passBoxTxt = bank.findElement(By.xpath("//input[@name='AuthenticationFG.ACCESS_CODE']"));
		passBoxTxt.sendKeys("1233456");
		
		WebElement loginBtn = bank.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']"));
		loginBtn.click();
		
		Alert alert = bank.switchTo().alert();


		alert.accept();

}
}