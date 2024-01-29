package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");

		driver.manage().window().maximize();
		WebElement userNameBox = driver.findElement(By.id("username"));
		userNameBox.sendKeys("jayaselvam");

		WebElement passWordBox = driver.findElement(By.id("password"));
		passWordBox.sendKeys("at2EX@XhhG@@j");

		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();

		WebElement allAvailableLoction = driver.findElement(By.id("adult_room"));
		Select s = new Select(allAvailableLoction);
		List<WebElement> adultsPerRoom = s.getOptions();
		for (int i = 0; i < adultsPerRoom.size(); i++) {

			String text = adultsPerRoom.get(i).getText();
			System.out.println(text);
		}
	}
}