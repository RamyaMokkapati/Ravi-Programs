package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame_test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	WebElement ele = driver.findElement(By.xpath("//span[text()=\"Sign In\"]"));
		
	Actions a=new Actions(driver);
    a.moveToElement(ele).perform();
    
    driver.findElement(By.xpath("//a[text()='login']")).click();
    
    //driver.switchTo().frame(0);
    
    //driver.findElement(By.id("userName")).sendKeys("123456789");
    
    
  
	}
	
	
}
