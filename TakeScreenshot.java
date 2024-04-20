package main.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();

		// firstly we are creating reference of Talkescreenshot interface

		TakesScreenshot ts = (TakesScreenshot) driver;

		// calling getscreenshot method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		// Move the file into new destination folder
		File destFile = new File("C:\\image\\error.png");
		
		// we will copy the screenshot into destination folder
		Files.copy(srcFile, destFile);

	}

}
