package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userid=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		WebElement keepcheckbox=driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
		System.out.println(userid.getTagName());
		System.out.println(password.getTagName());
		System.out.println(keepcheckbox.getTagName());
	}

}
