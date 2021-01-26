package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightWidthofImage 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement imagefb=driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg']"));
				System.out.println(imagefb.getSize().getHeight());
				System.out.println(imagefb.getSize().getWidth());
	}

}
