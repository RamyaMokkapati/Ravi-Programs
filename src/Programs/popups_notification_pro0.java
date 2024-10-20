package Programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popups_notification_pro0 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

}
