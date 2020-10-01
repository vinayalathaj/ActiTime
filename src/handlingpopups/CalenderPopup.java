package handlingpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/booking/find-flights?tripType=roundTrip");
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='2'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Next']")).click(); //(clicking on Next 3 times to go to future months)
		}
		
		driver.findElement(By.xpath("(//a[.='2'])[2]")).click();

	}

}
