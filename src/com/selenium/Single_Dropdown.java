package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver\\Chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01my58yhaxlrzb8byzpoq2e8vp37077.node0");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
//select is class:
		Select s = new Select(findElement);
		s.selectByIndex(2);
		Thread.sleep(2500);
		s.selectByVisibleText("Selenium");

	}

}
