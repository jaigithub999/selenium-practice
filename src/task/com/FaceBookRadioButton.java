package task.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookRadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createBtn = driver.findElement(By.xpath("//a[contains(text(),'new account')]"));
		createBtn.click();
		Thread.sleep(3000);
		List<WebElement> radioBtn = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No of Button: "+radioBtn.size());
	
	
	}
}