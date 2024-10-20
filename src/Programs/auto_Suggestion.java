package Programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_Suggestion {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("seleni");

WebElement e=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
// int a=10; the above statement is similarly to this

e.sendKeys("seleni");


List<WebElement> e1=driver.findElements(By.xpath("//li[@class=\"sbct PZPZlf\"]"));
//count the options
System.out.println(e1.size());

//to print text

for(WebElement b:e1)
{
	System.out.println(b.getText());
	}

driver.close();
	}

}
