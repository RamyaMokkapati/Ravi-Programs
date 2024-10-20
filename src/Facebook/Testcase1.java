package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void tc1() {
		driver.findElement(By.id("email")).sendKeys("9632121119");
		driver.findElement(By.name("pass")).sendKeys("Allu@091998");
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "Facebook");
		
		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);
		s.assertAll();
	
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();	
	}
	
	
}
