package handlingpopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriChildBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> windows=driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(windows);
		System.out.println(al.size());
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(al.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(al.get(2));
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());

	}

}
