package main.com;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_Seed\\Software\\Chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();  
		
		String ParesntWindow = driver.getWindowHandle();
		System.out.println(ParesntWindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
					// it will store all the window uniquely
					// we have to use set<>,,coz set <> doesn't allow duplicate values 
		Set<String> ChildWindow=driver.getWindowHandles();
		Iterator<String> i=ChildWindow.iterator();
		
		while(i.hasNext())
		{
			String ChildWindow1=i.next();
			System.out.println(ChildWindow1);
			if(!ParesntWindow.equalsIgnoreCase(ChildWindow1))
			{
				driver.switchTo().window(ChildWindow1);
				WebElement downloads=driver.findElement(By.linkText("Downloads"));
				//WebElement downloads=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a"));
				downloads.click();
				//driver.close();
			}
			Thread.sleep(2000);
			driver.switchTo().window(ParesntWindow);
		}
		

	}

}