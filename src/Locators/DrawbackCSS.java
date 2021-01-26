package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawbackCSS {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vinay/Desktop/Java-Selenium/DrawbackCSS.html");
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Veena");		
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Saritha");	
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Veena");		
		driver.findElement(By.xpath("/html/body/input [2]")).sendKeys("Saritha");	
		
	}

}
