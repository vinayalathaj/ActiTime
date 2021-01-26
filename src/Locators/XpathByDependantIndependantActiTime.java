package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByDependantIndependantActiTime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button popup_menu_button_settings')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Vacation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'delete')]")).click();
		
	}

}
