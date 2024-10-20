package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

	//step:1 open the browser
      WebDriver driver=new ChromeDriver();
      
	//step:2 Maximize the browser
	  driver.manage().window().maximize();
      
	//step:3.Enter the url
      driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
	//step:4 Enter the valid username
	driver.findElement(By.name("email")).sendKeys("raviteja@gmail.com");
      
	//step:5 Enter the valid password
      driver.findElement(By.id("password")).sendKeys("123456789");
		
	//step:6 Click on login button     //*[@id="last"]
		driver.findElement(By.xpath("//button[@class=\"login_Btn\"]")).click();
      
	//step:7 Get the title
		String title=driver.getTitle();
      System.out.println(title);
      
	//step:8 Get the current url
      String Url=driver.getCurrentUrl();
      System.out.println(Url);
      
      //step:10 verification
      if(title.equals("SkillRary Courses"))
      {System.out.println("Pass: Home page is displayed");}
      else
      {System.out.println("Fail: Home page is not displayed");}  
	//step:10 Close the application
		driver.close();

	}

}
