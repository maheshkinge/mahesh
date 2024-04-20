package main.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpAndScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(1000);
	
	//to scroll down we need to give positive value
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(1000);
	
	//to scroll up we need to give negative value
	js.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(1000);
	
	

	}

}
