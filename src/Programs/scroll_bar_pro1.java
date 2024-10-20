package Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_bar_pro1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement ele = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-none _fluid-fat-image-link-v2_style_fluidImageContainer__2SOMr\"])[3]"));
		
		//img[@alt=\"Up to 70% off | International brands\"]
		
		Point p = ele.getLocation();
		int x= p.getX();
		int y= p.getY();
		
		//typecasting	
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy("+x+","+y+")");

	Thread.sleep(3000);
	ele.click();
	
	//js.executeScript("arguments[0].Click();", ele); { this is used when normal click is not worked to perform click using javascriptexecutor}
	JavascriptExecutor js1=(JavascriptExecutor) driver;
	js1.executeScript("arguments[0].Click();", ele);
	}

}
