package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Exector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();

		JavascriptExecutor s1 = (JavascriptExecutor) driver;
		WebElement ScrollDown = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
		// s1.executeScript("argument[0].scrollIntoview();",findElement);
		s1.executeScript("arugument[0].scrollIntoview();", ScrollDown); // using webelement

		s1.executeScript("window.scrollBy(0,range);"); // using range
		s1.executeScript("window.scrollBy(0,3000);");// scrolldown
		Thread.sleep(2500);
		s1.executeScript("window.scrollBy(0,-2000);");// scrollup

	}

}
