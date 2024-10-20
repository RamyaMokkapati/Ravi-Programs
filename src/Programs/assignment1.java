package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("Ravi_teja");
		driver.findElement(By.name("pass")).sendKeys("#######@123");
		driver.findElement(By.name("login")).click();
		
		driver.close();
		
		
		
	
	}

}
