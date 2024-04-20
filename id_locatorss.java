package main.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locatorss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");

//to find the element by using id locator firstly we need to create reference variable of webelement interface and to use below syntax

		WebElement username = driver.findElement(By.id("email"));

		WebElement password = driver.findElement(By.id("pass"));

		WebElement login = driver.findElement(By.id("u_0_b"));

//sendkeys method is used to enter the value in textbox

		username.sendKeys("maheshkinge");
		password.sendKeys("mahesh1357");
// click method is used to click on any bbutton ,radio button checkbbox or link

		login.click();

	}

}
