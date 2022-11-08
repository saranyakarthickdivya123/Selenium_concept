package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
//buttons
		Actions s1 = new Actions(driver);

		WebElement button = driver.findElement(By.id("doubleClickBtn"));
		s1.doubleClick(button).build().perform();

		WebElement button1 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		s1.contextClick(button1).build().perform();

		WebElement button2 = driver.findElement(By.xpath("//button[text()='Click Me']"));
		s1.click(button2).build().perform();

//drag&drop
		driver.get("https://demoqa.com/droppable");

		WebElement drag = driver.findElement(By.id("draggable"));
		s1.clickAndHold(drag).build().perform();
		Thread.sleep(2500);
		WebElement drop = driver.findElement(By.id("droppable"));
		s1.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(2500);
		s1.moveToElement(drag).release(drop).build().perform();

	}

}
