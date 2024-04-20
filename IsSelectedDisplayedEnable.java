package main.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDisplayedEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/facebook.html");

        WebElement username = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));
        
//        boolean result = username.isDisplayed();
//        boolean result1 = username.isDisplayed();  
//        System.out.println(result);
//        System.out.println(result1);
        
//        boolean result = username.isDisplayed();
//      boolean result1 = username.isDisplayed();  
//      System.out.println(result);
//      System.out.println(result1);
      
        //is displayed method is used to validation elementt present or not 
        // is enabled method  is used to check element is enabled or dispalyed
        if(username.isDisplayed()&& username.isEnabled())
        {
        	username.sendKeys("mahesh");
        	
        }
        else
        {System.out.println("username is not displayed");
        
        }
        if(password.isDisplayed()&& password.isEnabled()) 
        {
        
        password.sendKeys("mahesh");
        }
        else
        {
        	System.out .println("passworrd is not displayed");
        }
	 WebElement checkox = driver.findElement(By.id("persist_box"));
	 
	 //isselected method is used to validation checkbox  or radio button is already sellected or not 
	 
	 
	boolean result = checkox.isSelected();
	 System.out.println(result);

}
}