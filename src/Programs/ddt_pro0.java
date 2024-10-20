package Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddt_pro0 {

	public static void main(String[] args) throws IOException  {

		//step1 : need to create a object for properties class
		Properties p = new Properties();
		FileInputStream fis=new FileInputStream("./Data.properties");
		p.load(fis);	
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(p.getProperty("url"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
driver.findElement(By.id("loginButton")).click();

	}

}
