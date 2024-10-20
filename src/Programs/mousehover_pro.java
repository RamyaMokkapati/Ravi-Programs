package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover_pro {

	public static void main(String[] args) {

WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.ebay.com/");

WebElement e=driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));

// create a object for actions class
Actions a=new Actions(driver);

// using MoveToElement method for mousehover
a.moveToElement(e).perform();

driver.findElement(By.xpath("//a[text()='Samsung']")).click();

	}

}
