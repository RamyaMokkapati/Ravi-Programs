package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click_pro {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapp.skillrary.com/");
			
	
	WebElement e1=driver.findElement(By.xpath("//div[@class=\"dropdown\"]"));
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	
	driver.findElement(By.xpath("(//a[@href=\"product.php?product=selenium\"])[1]")).click();
   WebElement e= driver.findElement(By.id("add"));                               
a1.doubleClick(e).perform();
		
		
	
	}
	

}
