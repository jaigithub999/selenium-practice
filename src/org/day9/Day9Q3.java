package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement createBtnFb = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createBtnFb.click();
		Thread.sleep(2000);

		WebElement birthDayYearDropDown = driver.findElement(By.id("year"));

		Select s = new Select(birthDayYearDropDown);
		List<WebElement> allAvailableOption = s.getOptions();
		System.out.println(": All Year Present In The YearDropDown :");
		for (WebElement allYear : allAvailableOption) {
			/*String text = allYear.getText();
			System.out.println(text);
*/
		String attribute = allYear.getAttribute("value");
		System.out.println(attribute);
		
		
		}
	}
}