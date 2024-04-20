package main.com;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/button"));
		button1.click();
		
		Set<String> childwindows = driver.getWindowHandles();
		Iterator<String> i = childwindows.iterator();
		while(i.hasNext())
		{
			String childwindow1 = i.next();
			if(!parentWindow.equalsIgnoreCase(childwindow1))
			{

	}

		}
	}
}
