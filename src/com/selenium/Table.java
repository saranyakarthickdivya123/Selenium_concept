package com.selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();

		System.out.println("########## All Data ###########");

		List<WebElement> all_data = driver.findElements(By.xpath("//table[@id='customers']/tboby/tr/td"));
		for (WebElement copy : all_data) {
			System.out.println(copy.getText());

		}
		System.out.println("########## All Head Data##########");

		List<WebElement> Head_data = driver.findElements(By.xpath("//table[@id='customers']/tboby/tr/th"));
		for (WebElement copy : Head_data) {
			System.out.println(copy.getText());
		}

		System.err.println("############ All Row Data ############ ");

		List<WebElement> Row_data = driver.findElements(By.xpath("//table[@id='customers']/tboby/tr[2]/td"));
		for (WebElement copy : Row_data) {
			System.out.println(copy.getText());

		}
		System.out.println("########### Column Data ######### ");
		List<WebElement> Column_data = driver.findElements(By.xpath("//table[@id='customers']/tboby/tr/td[1]"));
		for (WebElement copy : Column_data) {
			System.out.println(copy.getText());

		}
		System.out.println("########## Particular Data ###########");
		List<WebElement> Particular_data = driver.findElements(By.xpath("//table[@id='customers']/tboby/tr[3]/td[2]"));
		for (WebElement copy : Particular_data) {
			System.out.println(copy.getText());
		}
	}
}
