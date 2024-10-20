package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drag_and_drop_ms_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/Desktop/Selenium_relateded_doc/multi_select_Sample_program.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement e=driver.findElement(By.id("MTR"));
		Select s=new Select(e);
		s.selectByIndex(0);
		s.selectByValue("D");
		s.selectByVisibleText("Umpa");
		
		//deselection
		
		s.deselectByVisibleText("Umpa");
		s.deselectByValue("D");
		s.deselectByIndex(0);
	}
	
}
