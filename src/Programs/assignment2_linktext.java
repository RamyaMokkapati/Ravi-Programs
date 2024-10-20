package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2_linktext {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.name("email")).sendKeys("0022446688");
		driver.findElement(By.id("did_submit")).click();
		Thread.sleep(5000);
		
		//partiallinkText
		
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.name("email")).sendKeys("0022446688");
		driver.findElement(By.id("did_submit")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
