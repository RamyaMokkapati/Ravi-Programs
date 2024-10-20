package Programs;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_bar_pro0 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//typecasting	
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,5000)");

Thread.sleep(3000);
js.executeScript("window.scrollBy(0,-5000)");

Thread.sleep(3000);
	driver.close();
	}
}
