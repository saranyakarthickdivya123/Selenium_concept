package com.Mini_Project;


	import java.io.File;
	import java.io.IOException;
	import java.util.logging.FileHandler;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Mini_Project {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("saranya12345");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("saranya");
			WebElement login = driver.findElement(By.id("login"));
			login.click();
			Thread.sleep(2500);
	//Select s =new Select(null);
			WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
			Select a = new Select(location);
			Thread.sleep(2500);
			a.selectByIndex(2);
			WebElement hotels = driver.findElement(By.id("hotels"));
			Select a1 = new Select(hotels);
			a1.selectByIndex(3);
			WebElement room_type = driver.findElement(By.id("room_type"));
			Select a2 = new Select(room_type);
			a2.selectByValue("Standard");
			WebElement room_nos = driver.findElement(By.id("room_nos"));
			Select a3 = new Select(room_nos);
			a3.selectByIndex(2);
			WebElement date = driver.findElement(By.id("datepick_in"));
			date.clear();
			date.sendKeys("31/08/2022");
			WebElement dateout = driver.findElement(By.id("datepick_out"));
			dateout.clear();
			dateout.sendKeys("02/09/2022");
			WebElement adult = driver.findElement(By.id("adult_room"));
			Select a4 = new Select(adult);
			a4.selectByIndex(2);
			WebElement child = driver.findElement(By.id("child_room"));
			Select a5 = new Select(child);
			a5.selectByValue("1");
			WebElement submit = driver.findElement(By.id("Submit"));
			submit.click();
			WebElement radio = driver.findElement(By.id("radiobutton_0"));
			radio.click();
			WebElement con = driver.findElement(By.id("continue"));
			con.click();
			WebElement first = driver.findElement(By.id("first_name"));
			first.sendKeys("divya");
			WebElement last = driver.findElement(By.id("last_name"));
			last.sendKeys("kanishka");
			WebElement address = driver.findElement(By.id("address"));
			address.sendKeys("chennai");
			WebElement ccnum = driver.findElement(By.name("cc_num"));
			ccnum.sendKeys("1234 5678 9123 4567");
			WebElement cctype = driver.findElement(By.id("cc_type"));
			Select a6 = new Select(cctype);
			a6.selectByIndex(2);
			WebElement month = driver.findElement(By.id("cc_exp_month"));
			Select a7 = new Select(month);
			a7.selectByIndex(8);
			WebElement year = driver.findElement(By.id("cc_exp_year"));
			Select a8 = new Select(year);
			a8.selectByIndex(9);
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys("555555555");
			WebElement book = driver.findElement(By.id("book_now"));
			book.click();
			Thread.sleep(5000);
			TakesScreenshot mp = (TakesScreenshot) driver;
			File source = mp.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_10am\\Takess.png");
			FileUtils.copyFile(source, destination);
			Thread.sleep(3000);
			WebElement logout = driver.findElement(By.id("logout"));
			logout.click();
		}

	}
