package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://facebook.com");
		driver.findElement(By.xpath("//a[.='Forgot account?']")).click();*/
		
		/*driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//div[.='Login ']")).click();*/
		
		/*driver.get("https://myntra.com");
		driver.findElement(By.xpath("//a[.='Essentials']")).click();*/
		
		driver.get("https://demo.actitime.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Forgot your password?']")).click();
		

	}

}
