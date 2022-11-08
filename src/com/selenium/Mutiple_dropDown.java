package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mutiple_dropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.xpath("//select[@id='cars']"));

		Select s1 = new Select(findElement);
		s1.selectByIndex(1);
		Thread.sleep(2500);
		s1.selectByValue("volvo");
		Thread.sleep(2500);
		s1.selectByVisibleText("Opel");
		// deselect
		s1.deselectByIndex(3);
		Thread.sleep(2500);
		s1.deselectByValue("opel");
		Thread.sleep(2500);
		s1.deselectByVisibleText("Audi");

	}

}
