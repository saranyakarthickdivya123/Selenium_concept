package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
		findElement.sendKeys("saranya");

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// navigation methods:
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(2500);
		driver.navigate().forward();
		Thread.sleep(2500);
		driver.navigate().back();
		Thread.sleep(2500);
		driver.navigate().refresh();
		Thread.sleep(2500);
		driver.close();

	}

}
