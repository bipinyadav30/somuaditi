package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testscript {

	@Test
	public void launchBrowser() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("Browser launched ");
		driver.quit();
		System.out.println("window closed");
	}
}
