package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop_pro {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement e=driver.findElement(By.xpath("//h1[text()=\"Block 1\"]"));
	WebElement e1=driver.findElement(By.xpath("//h1[text()=\"Block 4\"]"));
	Actions a=new Actions(driver);
	
a.dragAndDrop(e, e1).perform();
	}
	

}
