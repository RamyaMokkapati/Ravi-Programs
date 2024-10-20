package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3_navigation {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver=new ChromeDriver();
			
		    driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			driver.navigate().back();
			Thread.sleep(5000);
			
			driver.navigate().forward();
			Thread.sleep(5000);
			
			driver.navigate().refresh();
			Thread.sleep(5000);
			
			driver.close();

	}

}
