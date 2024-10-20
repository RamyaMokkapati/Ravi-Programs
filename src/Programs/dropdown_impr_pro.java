package Programs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_impr_pro {

	private static final String Arrarylist = null;

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//a[text()='Create new account']")).click();

WebElement e=driver.findElement(By.id("month"));
Select s=new Select(e);
s.selectByIndex(0);
s.selectByValue("3");
s.selectByVisibleText("May");

//count the option: 
//step1: using method called getOptions [s.getOptios()], 
//step2:store it inside one reference variable [opt=s.grtOptions()], 
//step3: write type of this is string opt.size()
List<WebElement> opt = s.getOptions();
System.out.println(opt.size());


//crate object for ArrayList
ArrayList a=new ArrayList();


//print the text
//step1: use for
//step2:store it in a reference variable [v:opt], 
//red line is appeared mouse over on the line popup will appeared click on Create loop variable V
//step3: write type of this is string v.getText() and store it in variable text
//step4: write println statement for text
for(WebElement v:opt) {
String text = v.getText();		
System.out.println(text);

// Storing all text in one container
a.add(text);
}

// need to verify it single select or multi select
// write type of this is string in print for s
System.out.println(s.isMultiple());

// process to store the text
//step1: we have to create a object for class called ArrayList to store the element
//step2: list created we need to store it in one container. store all text in one container a.add(text)

System.out.println("----------after sorting--------------");

//step3: to sort  we have method call Collections.sort();, what we need to sort that should be mention ex:-Collections.sort(a);
Collections.sort(a);

//step4: to print the list, store ArrayList "a" in one variable 
for(Object v1:a) {	
System.out.println(v1);
}

driver.close();
	}

}
