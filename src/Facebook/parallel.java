package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {
public WebDriver driver;
//should be imported from TestNG annotations only
@Parameters ({"browserName"})
@Test
public void demo(String browser) {
if(browser.equals("chrome"))	{
driver=new ChromeDriver();	
}
else {
	driver=new EdgeDriver();	
}
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("email")).sendKeys("123456789");
driver.findElement(By.name("pass")).sendKeys("123456789");
driver.findElement(By.name("login")).click();
String title = driver.getTitle();
Reporter.log(title, true);
String url = driver.getCurrentUrl();
Reporter.log(url, true);	
}
}
