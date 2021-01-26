package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersXpathByIndependantDependant {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qspiders.com/contact");
		String qsUKContact = driver.findElement(By.xpath("//a[.='Qspiders Uk']/../../..//div[3]/span[1]/div[1]")).getText();
		System.out.println("UK Phone No: " + qsUKContact);
		
		String qsUSContact = driver.findElement(By.xpath("//a[.='Qspiders Us']/../../..//div[3]/span[1]/div[1]")).getText();
		System.out.println("US Phone No: " + qsUSContact);

	}

}
