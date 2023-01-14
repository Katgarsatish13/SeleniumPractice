package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {
	
	//Declration
	@FindBy(id="username")
	private WebElement usertb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	//initialization
	Actitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public void username(String name)
	{
		usertb.sendKeys(name);
	}
	public void password(String name)
	{
		passwordtb.sendKeys(name);
	}
	public void loginbuuton()
	{
		loginbtn.click();
	}

}
