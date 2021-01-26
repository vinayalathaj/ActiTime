package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//button[@class='close']")).click();
		Thread.sleep(2000);
		WebElement framevideo=driver.findElement(By.xpath("(//iframe[@class='videomine-frame'])[1]"));
		driver.switchTo().frame(framevideo);
		driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/zlUnD1TEnT4']")).click();
		

	}

}
