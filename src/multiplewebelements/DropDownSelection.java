package multiplewebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement month=driver.findElement(By.id("month"));
		Select selmonth=new Select(month);
		selmonth.selectByVisibleText("May");
		//sel.selectByValue("5");
		
		WebElement day=driver.findElement(By.id("day"));
		Select selday=new Select(day);
		//selday.selectByVisibleText("22");
		selday.selectByValue("22");
		
		WebElement year=driver.findElement(By.id("year"));
		Select selyear=new Select(year);
		selyear.selectByVisibleText("1978");
		
		
		
	}

}
