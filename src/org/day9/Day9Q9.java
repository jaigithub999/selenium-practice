package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day9Q9 {
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

		WebElement allRoomType = driver.findElement(By.id("room_type"));
		Select s = new Select(allRoomType);
		
		List<WebElement> allRoomTypeDropdown = s.getOptions();
		System.out.println(": Type Of Room Available :");
		for (WebElement countryList : allRoomTypeDropdown) {
			String attribute = countryList.getAttribute("value");
			System.out.println(attribute);
			
		}

}
}