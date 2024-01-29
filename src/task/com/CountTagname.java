package task.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CountTagname {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\msedgedriver.exe");

		WebDriver demo = new EdgeDriver();

		demo.get("https://demo.automationtesting.in/Register.html");

		demo.manage().window().maximize();

		String currentUrl = demo.getCurrentUrl();
		System.out.println(currentUrl);

		String title = demo.getTitle();
		System.out.println(title);

		List<WebElement> paragraphCounts = demo.findElements(By.tagName("p"));
		System.out.println("Number Of Paragraph in the page: " + paragraphCounts.size());

		List<WebElement> inputBox = demo.findElements(By.tagName("input"));
		System.out.println("Number of Textfield in the page: " + inputBox.size());

		List<WebElement> imageCounts = demo.findElements(By.tagName("img"));
		System.out.println("Number of Image in the Page: " + imageCounts.size());

		List<WebElement> linksCounts = demo.findElements(By.tagName("a"));
		System.out.println("Number of LInks in the Page: " + linksCounts.size());

		List<WebElement> buttonCounts = demo.findElements(By.tagName("button"));
		System.out.println("Number Of Buttons in the page: " + buttonCounts.size());
		
		List<WebElement> IframeCounts = demo.findElements(By.tagName("iframe"));
		System.out.println("Number Of Iframs in the page: "+IframeCounts.size());
		
		List<WebElement> radioButton = demo.findElements(By.tagName("label"));
		System.out.println("Number of Radio Button:"+radioButton.size());

	}

}
