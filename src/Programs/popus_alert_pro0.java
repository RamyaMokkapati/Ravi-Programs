package Programs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popus_alert_pro0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		//switch the control to popup
		Alert alt = driver.switchTo().alert();
		
		// click on ok button
		//alt.accept();
		
		//click on cancel button
		alt.dismiss();
	}

}
