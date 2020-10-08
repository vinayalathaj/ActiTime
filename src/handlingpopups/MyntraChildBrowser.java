package handlingpopups;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraChildBrowser 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Sketchers");
		List<WebElement> search=driver.findElements(By.xpath("//li[contains(text(),'Skechers')]"));
		for (int i = 0; i<search.size(); i++)
		{
			search.get(i).getText();
		}
		
		search.get(2).click();
		
		driver.findElement(By.xpath("//a[@href='sports-shoes/skechers/skechers-women-navy-blue-dlux-walker-running-vision-shoes/11376858/buy']")).click();
		
		//From here it will open new window with Product
		Set<String> windows=driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<>(windows);
		System.out.println(al.size());
		
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[.='5']")).click();
		driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//a[.='GO TO BAG']")).click();
		driver.findElement(By.xpath("//div[.='Place Order']")).click();
		


	}

}
