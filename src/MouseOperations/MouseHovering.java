package MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.myntra.com");
		WebElement homenliving=driver.findElement(By.xpath("//a[.='Home & Living']"));
		WebElement bedsheets=driver.findElement(By.xpath("//a[.='Bedsheets']"));
		Actions act= new Actions(driver);
		act.moveToElement(homenliving).perform();
		//act.moveToElement(bedsheets).click(bedsheets).perform();
		act.click(bedsheets).perform();
	}

}
