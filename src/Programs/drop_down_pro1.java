package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_pro1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Ravi/Desktop/Selenium_relateded_doc/multi_select_Sample_program.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd=driver.findElement(By.id("MTR"));
		Select s=new Select(dd);
		s.selectByIndex(0);
		s.selectByValue("D");
		s.selectByVisibleText("Umpa");
		
		System.out.println(s.isMultiple());
		
		Thread.sleep(3000);
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
	}

	
}
