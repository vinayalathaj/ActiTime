package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggestions.size());
		
		/*Using Index
		for (int i = 0; i<suggestions.size(); i++)
		{
			System.out.println(suggestions.get(i).getText());
		}
		
		suggestions.get(3).click();*/
		
		//Using Text
		for (int i = 0; i<suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{
				suggestions.get(i).click();
				break;
			}
		}
		 
		
		
	}

}
