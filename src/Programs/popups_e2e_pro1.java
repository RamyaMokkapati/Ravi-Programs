package Programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class popups_e2e_pro1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("course"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()=\"Selenium\"])[1]"));
		
		Actions a1=new Actions(driver);
		a1.moveToElement(ele1).perform();
		ele1.click();
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
	   Alert alt = driver.switchTo().alert();
	   alt.accept();
		
	  
	}

}
