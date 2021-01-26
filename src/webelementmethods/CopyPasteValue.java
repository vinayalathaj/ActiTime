package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteValue 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		WebElement emailphone=driver.findElement(By.xpath("//input[@name='email']"));
		emailphone.sendKeys("Vinaya");
		String value=emailphone.getAttribute("value");
		WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys(value);
		System.out.println(password.getAttribute("value"));
	}

}
