package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thread_sleep_pro {

	public static void main(String[] args) throws InterruptedException {
			 
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("8792289228");
			driver.findElement(By.name("password")).sendKeys("123456789");
			
				 

	}

}
