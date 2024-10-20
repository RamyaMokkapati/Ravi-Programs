package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitly_wait_pro {

	public static void main(String[] args) throws InterruptedException {
		 
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.name("username")).sendKeys("8792289228");
	driver.findElement(By.name("password")).sendKeys("123456789");
	driver.findElement(By.xpath("(//div[contains(@class, 'x1nhvcw1')])[5]")).click();
		
    driver.close();
	}

}


