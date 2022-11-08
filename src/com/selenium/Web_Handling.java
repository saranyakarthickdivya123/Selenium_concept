package com.selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Web_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions a1 = new Actions(driver);
		Robot r1 = new Robot();
//1st Window
		WebElement findElement = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		a1.contextClick(findElement).build().perform();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2500);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
//2nd Window
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a1.contextClick(findElement2).build().perform();
		r1.keyPress(KeyEvent.VK_PAGE_DOWN);
		r1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2500);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);

		// size
		// parent window id
		// get all window title
		// particular window
		// for get window size

		int size = driver.getWindowHandles().size();
		System.err.println(size);
		System.out.println("###############################");
		// get ID for parent window

		String Id = driver.getWindowHandle(); // return type
		System.out.println(Id);
		System.err.println("##############################");

		// get title for all window

		Set<String> gettitle = driver.getWindowHandles(); // using for foreach
		for (String all : gettitle) {
			String title = driver.switchTo().window(all).getTitle(); // return type
			System.err.println("All Window Title     " + title); // concordination

			// particular window
			String title1 = "Amazon.in Bestsellers";
			for (String all1 : gettitle) {
				if (driver.switchTo().window(all1).getTitle().equals(title1)) {
					break;
				}
			}
			WebElement findElement3 = driver.findElement(By.id("twotabsearchtextbox"));
			findElement3.sendKeys("taptop");
			WebElement findElement4 = driver.findElement(By.id("nav-search-submit-button"));
			findElement4.click();

			Thread.sleep(2500);
			driver.close();
			Thread.sleep(2500);
			driver.quit();
			Thread.sleep(2500);

			// task
			for (String cp : gettitle) {
				if (cp.equals(title1)) {
					driver.switchTo().window(cp);
					driver.close();

				}
			}
		}

	}
}