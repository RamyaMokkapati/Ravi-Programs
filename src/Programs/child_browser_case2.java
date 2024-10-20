package Programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class child_browser_case2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		String parent = driver.getWindowHandle();

		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		                           //or
		//WebElement ele = driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]"));
		//Actions a=new Actions(driver);
		//a.moveToElement(ele).perform();
		//ele.click();
		
		Set<String> child = driver.getWindowHandles();
		for(String c:child) {
			driver.switchTo().window(c);
		}
		
		driver.findElement(By.xpath("(//a[text()='Selenium'])[2]")).click();	
		
		driver.switchTo().window(parent);
		
        driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' HTML Editor'])[2]")).click();
		
		driver.quit();
	
	}

}
