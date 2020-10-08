package handlingpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;

public class WebPushNotificationEdge {

	public static void main(String[] args) 
	{
		//EdgeOptions options=new EdgeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
	}

}
