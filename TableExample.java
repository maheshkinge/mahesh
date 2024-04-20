package main.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	private static int j;
	private static char[] rowName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\softeware\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		driver.manage().window().maximize();
		// to fetch the all the columns from the table we will

		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\\\"leftcontainer\\\"]/table/thead/tr/th"));
		int size = columns.size();
		System.out.println("total no of columns are" + size);

		for (int i = 0; i < size; i++) {
			String columnsName = columns.get(i).getText();
			System.out.println(columns);
			if (columnsName.equalsIgnoreCase("company")) {
				System.out.println("We have  column name as per requiremennt");
			}
		}
		// to fetch the all the rows from the table wee will use the below code
		List<WebElement> rows = driver.findElements(By.xpath("//*{@id=\"leftcontainer\"]/table/tbody/tx"));
		int size1 = rows.size();
		System.out.println("Total nno of rows are" + size1);
		for (int j = 0; j < size1; j++)
			;
		{
			String rowsName = rows.get(j).getText();

			System.out.println(rowName);
		}
		//to fetch the cell data we will use the below code
		WebElement cellData =driver.findElement(By.xpath("//*[@id=\"leftcontainerr\"]/table/tbody/tr[[6]/td[2]"));
		System.out.println(cellData.getText());
	}

}
