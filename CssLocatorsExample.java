package main.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://demo.guru99.com/test/facebook.html");

//1. by using tag annd class name
//WebElement un = driver.findElement(By.cssSelector("input.inputtext"));

//2. by using tags and id
//WebElement pass = driver.findElement(By.cssSelector("input#pass"));


//un.sendKeys("mahesh");
//pass.sendKeys("mahesh@13");

//3.by using tag and attributes

//WebElement un = driver.findElement(By.cssSelector("input[type='text'][name='email'"));

//4.by uusing tags and attribites
//WebElement pass = driver.findElement(By.cssSelector("input.inputtext[type ='password'][tabindex='2'"));

//un.sendKeys("mahesh");
//pass.sendKeys("mmaheesh@138");

//5. by using tag and attributes
//WebElement login = driver .findElement(By.cssSelector("input#u_0_b[type ='submit'][value='log In']"));
//login.click();

//6.by using starts with it will find the locators basedon startingg character
//WebElement  un = driver.findElement(By.cssSelector("input[name = 'ema'"));
//un.sendKeys("mahesh");

//7.by using ends with - iit will find the locatoes based on ending  character
//WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
//pass.sendKeys("mahesh214");

//8.by using the contains- it will find the locators based on character which is present or not
WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
login.click();
	}

}
