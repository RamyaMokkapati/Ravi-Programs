package Test_Programs;

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

public class assert_pro {

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
			driver.findElement(By.id("email")).sendKeys("123456789");
			driver.findElement(By.name("pass")).sendKeys("123456789");
			driver.findElement(By.name("login")).click();
			
			String title = driver.getTitle();
			
			//syntax
			//Assert.assertEquals(actual, expected);
			
			//example
			Assert.assertEquals(title, "543wrtjierjighjieo");
			
			//syntax
			//SoftAssert s=new SoftAssert();
			//s.assertEquals(actual, expected);
			
			//example
			SoftAssert s=new SoftAssert();
			s.assertEquals(title, "456tghthjkhrtj");
			
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

