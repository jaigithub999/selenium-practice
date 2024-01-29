package org.broken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.firefox.driver","C:\\Users\\jayaselvamjai\\eclipse-workspace\\SeleniumClass\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No of LInks : " + links.size());
		for (WebElement l : links) {
			Thread.sleep(3000);
			String linkURl = l.getAttribute("href");
			System.out.println(linkURl);
			if (linkURl != null) {
				URL u = new URL(linkURl);
				URLConnection urlConnection = u.openConnection();
				HttpURLConnection h = (HttpURLConnection) urlConnection;
				int responseCode = h.getResponseCode();
				if (responseCode != 200) {
					System.out.println(links + "Broken Code" + responseCode);
				}
			}
			// verifyUrl(linkURl);

		}

	}

	/*
	 * public static void verifyUrl(String linkURL) throws IOException {
	 * 
	 * URL u = new URL(linkURL); HttpURLConnection h1 = (HttpURLConnection)
	 * u.openConnection(); h1.connect(); int code = h1.getResponseCode(); if (code
	 * >= 400) { System.out.println(linkURL + "Broken Code" + code); }
	 */
}
// }
