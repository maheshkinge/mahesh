package main.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WayToRefreshPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 1.by using refresh method
		driver.navigate().refresh();

		// 2. getcurrent url method
		driver.get(driver.getCurrentUrl());

		// 3.getcurrenturl navigate method
		driver.navigate().to(driver.getCurrentUrl());

		// 4. by uusing f5
		driver.findElement(By.id("email"));

		// 5. by usiing ascii value
		driver.findElement(By.id("email")).sendKeys("\uE035");

	}
}