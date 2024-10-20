package Programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class take_screenshot_pro {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step1: typecasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//step2: we can access the method and photo will be stored in ram
		File src = ts.getScreenshotAs(OutputType.FILE);   // the write type is file
		
		//step3: specify the location where photo should be stored 
		File dest=new File("./amazontestss1.png");
		
		//step4: copy paste from ram to your location
		FileUtils.copyFile(src, dest);

	}

}
