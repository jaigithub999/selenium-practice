package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q4 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();

			driver.get("https://www.facebook.com/");

			driver.manage().window().maximize();

			WebElement createBtnFb = driver.findElement(By.xpath("//a[text()='Create new account']"));
			createBtnFb.click();
			Thread.sleep(2000);

			WebElement birthDayYearDropDown = driver.findElement(By.id("month"));
			Select s = new Select(birthDayYearDropDown);
			
			List<WebElement> allAvailableOption = s.getOptions();
			System.out.println(": All Month Present In The MonthDropDown :");
			for (WebElement month : allAvailableOption) {
				System.out.println("\t"+month.getText());
			}

}
}