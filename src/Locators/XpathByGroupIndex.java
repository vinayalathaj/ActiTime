package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndex 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy'][@id='email']")).sendKeys("Saritha");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy'][@id='pass']")).sendKeys("abcd");
	}

}
