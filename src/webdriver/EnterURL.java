package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterURL {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//dirver.get("https://www.google.com");
		driver.navigate().to("https://facebook.com");
	}

}
