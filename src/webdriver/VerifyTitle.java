package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		if(actualTitle.equals("Google"))
		{
			System.out.println("titles are matching");
		}
		else
		{
			System.out.println("titles are not matching");
		}

	}

}
