package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6_locator2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("Forgot your password?")).click();
		//partiallinkText
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.close();
		
	}

}
