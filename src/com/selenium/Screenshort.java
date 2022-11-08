package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File sourse = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\ScreenShort\\img.png");

		FileUtils.copyFile(sourse, destination);
		
		File destination1 = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\ScreenShort\\img1.png");

		FileHandler.copy(sourse, destination1);

	}

}
