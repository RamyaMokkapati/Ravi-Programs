package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {

	//Declaration
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy (name="pwd")
	private WebElement passwordtb;
	
	@FindBy (xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	
	// Initialization
	public Actitime (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public void usernametextbox(String name) {
		usernametb.sendKeys(name);
	}
	
	public void passwordtextbox (String pwd) {
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton() {
	 loginbtn.click();
	}
	
	
	
}
