package Parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Testng {
	public WebDriver driver;
	@Parameters("browserName")
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
  			
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.findElement(By.name("email")).sendKeys("satish");
		
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		Reporter.log(title,true);
		String url = driver.getCurrentUrl();
		
		Reporter.log(url,true);
		
	}

}
