package Programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom_pro3 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://online.actitime.com/testing/login.do");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

Actitime a=new Actitime(driver);
a.usernametextbox("trainee");
a.passwordtextbox("trainee");
a.loginbutton();

Thread.sleep(10000);
driver.close();

	}

}
