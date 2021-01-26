package miscellaneous;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChatBot {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.findElement(By.xpath("//span[.='+']")).click();
		driver.findElement(By.xpath("//input[@class='mylivechat_offline_name_box mylivechat_offline_box']")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@class='mylivechat_offline_email_box mylivechat_offline_box']")).sendKeys("dummy@qc.com");
		driver.findElement(By.xpath("//input[@class='mylivechat_offline_custom_box mylivechat_offline_box']")).sendKeys("456456456");
		driver.findElement(By.xpath("//textarea[@class='mylivechat_offline_question_box mylivechat_offline_box']")).sendKeys("Please ignore automation purpose testing only");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[9]/div[1]/div[1]/input[1]")).click();
		
		StringSelection file = new StringSelection("C:\\Users\\vinay\\Desktop\\Java-Selenium\\Car.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		//driver.findElement(By.xpath("//button[@class='mylivechat_offline_submit_button']")).click();
		
		
		
		

	}

}
