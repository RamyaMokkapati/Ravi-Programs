package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment4_CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("rteja@gmai.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("3388114455");
		
	}

}
