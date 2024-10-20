package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom_pro2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//WebElement e = driver.findElement(By.id("APjFqb"));
		google_pom g=new google_pom(driver);
		
		driver.navigate().refresh();
		
		//e.sendKeys("Phone");
		  g.serachtextbox("Phone");
	}

}
