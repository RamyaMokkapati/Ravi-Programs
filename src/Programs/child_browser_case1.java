package Programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_case1 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.hdfc.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



//to get parent browser address
String parent = driver.getWindowHandle();
System.out.println(parent);


// if we use the below statement it will open in same tab
//driver.navigate().to("https://www.makemytrip.com/");

// case:1 handle this in new tab
driver.switchTo().newWindow(WindowType.TAB);
driver.navigate().to("https://www.makemytrip.com/"); // now control is present in makemytrip application

//to get child browser address
Set<String> child = driver.getWindowHandles();
System.out.println(child);

//driver.close(); if we use this method it will close only child browser only

driver.quit(); // we need quite method to close all tab 
	}

}
