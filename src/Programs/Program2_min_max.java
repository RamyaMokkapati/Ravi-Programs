package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_min_max {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize(); // Maximize the browser
			driver.get("https://skillrary.com/");
			
			Thread.sleep(5000); // delay statement 
			
			driver.manage().window().minimize(); // minimize the browser
			
			Thread.sleep(5000);
			
			driver.manage().window().fullscreen(); // full screen browser
			
			Thread.sleep(5000);
			
			driver.close();
	}

}
