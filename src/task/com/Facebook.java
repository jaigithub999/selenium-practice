package task.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver demo = new EdgeDriver();

		demo.get("https://www.facebook.com/");

		demo.manage().window().maximize();
		WebElement findElement = demo.findElement(By.id("email"));
JavascriptExecutor js = (JavascriptExecutor)demo;
js.executeScript("arguments[0].setAttribute('value','jai')", findElement);

}
}