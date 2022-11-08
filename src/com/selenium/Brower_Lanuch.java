package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brower_Lanuch {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\Chrome_driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/login/");
driver.manage().window().maximize();
	}

}
