package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBoxes {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vinay/Desktop/Java-Selenium/Checkboxes.html");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		
		/*//Click on all checkboxes
		for(int i = 0; i<checkbox.size(); i++)
		{
			Thread.sleep(2000);
			checkbox.get(i).click();
			
		}*/
		/*for(int i = 1; i<checkbox.size(); i=1+2)
		{
			Thread.sleep(2000);
			checkbox.get(i).click();
			
		}*/
		
		for(int i = checkbox.size()-2; i>=0; i=i-2)
		{
			Thread.sleep(2000);
			checkbox.get(i).click();
			
		}
		

	}

}
