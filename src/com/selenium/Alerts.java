package com.selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.AcceptAlert;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		WebElement findElement = driver.findElement(By.id("alertButton"));
		findElement.click();

		Alert simpleAlerts = driver.switchTo().alert();
		simpleAlerts.accept();
		Thread.sleep(2500);

		WebElement findElement2 = driver.findElement(By.id("confirmButton"));
		findElement2.click();

		Alert confirmAlerts = driver.switchTo().alert();
		confirmAlerts.dismiss();
		Thread.sleep(2500);

		WebElement findElement3 = driver.findElement(By.id("promtButton"));
		findElement3.click();

		Alert promtAlerts = driver.switchTo().alert();
		Thread.sleep(2500);
		promtAlerts.sendKeys("saranya");
		promtAlerts.accept();

		String alert1 = findElement3.getText();
		System.out.println("promtAlerts:" + alert1);

	}
}
