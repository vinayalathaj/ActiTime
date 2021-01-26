package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTraversing 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vinay/Desktop/Java-Selenium/ParentChildTraversing.html");
		//driver.findElement(By.xpath("/html//div[2]/input[2]")).click();
		//driver.findElement(By.xpath("//body/div[3]/input[1]")).click();
		driver.findElement(By.xpath("//div[1]/input[1]/../../..//div[3]/input[2]")).click();
		
		
		
	}

}
