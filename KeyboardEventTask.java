package main.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEventTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		WebElement current = driver.findElement(By.id("currentAddress"));
		WebElement permanent = driver.findElement(By.id("permanenntAddress"));

		Actions action = new Actions(driver);

		// enter the value in currentt address tab
		current.sendKeys("pune");

		// we will select the all the value frrom current address
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");

		// keyup method will use to release the given key
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		// now we wil copy the entire address  -- CTRL+C
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		// we will switch to the next element we will use tab key\
		action.sendKeys(Keys.TAB);
		action.build().perform();

		// last we will paste the address in permanent address tab---CTRL+V
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

	}

}
