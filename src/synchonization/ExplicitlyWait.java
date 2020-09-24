package synchonization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));*/
		
		//wait.until(ExpectedConditions.titleContains("actiTIME"));*/
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='menu_icon'])[2]")));
		
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	}

}
