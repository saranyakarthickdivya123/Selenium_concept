package com.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_Keyboard_Action {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().window().maximize();
		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2500);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2500);
		r.keyRelease(KeyEvent.VK_ENTER);

//using two buttos
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2500);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(2500);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2500);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(2500);

	}

}
