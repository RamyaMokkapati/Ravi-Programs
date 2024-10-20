package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4_navigate_to {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);

		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);

		driver.navigate().back();
		Thread.sleep(5000);

		driver.navigate().forward();
		Thread.sleep(5000);

		driver.navigate().refresh();
		Thread.sleep(5000);

		driver.manage().window().minimize();
		Thread.sleep(5000);

		driver.close();
	}

}
