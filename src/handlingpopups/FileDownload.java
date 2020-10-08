package handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FileDownload {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		
		Robot r=new Robot();
		for (int i=0;i<=3;i++)
		{
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER); //Clicked on Cancel Download
	}

}
