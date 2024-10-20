package Programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_pro {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.ebay.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement dropdown=driver.findElement(By.id("gh-cat"));

Select s=new Select(dropdown);
s.selectByIndex(4);
s.selectByValue("11450");
s.selectByVisibleText("Cameras & Photo");

s.deselectAll();

List<WebElement> opt=s.getOptions();
System.out.println(opt.size());

for(WebElement b:opt)
{
System.out.println(b.getText());	
}

driver.close();
	}

}
