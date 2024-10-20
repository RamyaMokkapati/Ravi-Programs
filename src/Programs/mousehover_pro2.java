package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover_pro2 {

	public static void main(String[] args) throws InterruptedException {

			
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.skillrary.com/");
		
	WebElement e=driver.findElement(By.xpath("(//a[@href=\"#\"])[1]"));
	Actions a=new Actions(driver);
	a.moveToElement(e).perform();
	driver.findElement(By.xpath("(//a[@class=\"ignorelink\"])[7]")).click();
	
	Thread.sleep(10000);
	
	WebElement e1=driver.findElement(By.xpath("//div[@class=\"dropdown\"]"));
	
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();


	}
	}
