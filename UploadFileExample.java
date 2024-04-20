package main.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		
		upload.sendKeys(" \"C:\\Users\\mahes\\OneDrive\\Documents\\Cheat_Sheet_Selenium_WebDriver_TestNG_and_Maven_1680069282.pdf\"");
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

}
