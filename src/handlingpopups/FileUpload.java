package handlingpopups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		StringSelection file = new StringSelection("C:\\Users\\vinay\\Downloads\\Jadhav_Utility.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		//input[@placeholder='Enter your full name']
		//input[@placeholder='Enter your active Email ID']
		//input[@placeholder='Enter Current Mobile number']
		//a[@data-id='exp-years-droope_2']
		//a[@data-id='exp-month-droope_2']
		//input[@placeholder='Enter your password']
		//button[.='Register']


	}

}
