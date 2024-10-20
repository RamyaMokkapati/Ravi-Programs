package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups_hidden_division_pro0 {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		driver.findElement(By.xpath("//p[text()='31']")).click();
		
	}

}
