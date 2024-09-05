package com.talent.demoSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
	
	@Test
	public void getChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		// to maximize the screen
//		options.addArguments("--headless=new");
//		options.addArguments("--start-maximized");
		// to disable the notifications by browser
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://leetcode.com/u/Paresh_kumar/");
		driver.quit();
	}

}
