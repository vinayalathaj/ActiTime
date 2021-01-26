package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer_x64_2.52.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://facebook.com");

	}

}
