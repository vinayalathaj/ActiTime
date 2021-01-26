package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedEnabledSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement keepcheckbox=driver.findElement(By.id("keepLoggedInLabel"));
		keepcheckbox.click();
		Thread.sleep(5000);
		System.out.println(keepcheckbox.isDisplayed());
		System.out.println(keepcheckbox.isEnabled());
		System.out.println(keepcheckbox.isSelected());

	}

}
