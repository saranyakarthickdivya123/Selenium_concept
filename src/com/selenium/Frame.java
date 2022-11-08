package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("saranya");

		driver.switchTo().defaultContent();

		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		findElement2.click();

		WebElement findElement3 = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		Thread.sleep(2500);
		driver.switchTo().frame(findElement3);

		WebElement findElement4 = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		Thread.sleep(2500);
		driver.switchTo().frame(findElement4);

		WebElement findElement5 = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2500);
		findElement5.sendKeys("goodmorning");

	}

}
