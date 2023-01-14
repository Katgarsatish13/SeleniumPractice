package Parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompatiblityTesting {
	public WebDriver driver ;
	@Parameters({"browserName"})
@Test
public void demo(String browser) throws InterruptedException
{

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

driver.get("https://www.facebook.com/login/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.name("email")).sendKeys("kuldya");
Thread.sleep(2000);
driver.findElement(By.name("pass")).sendKeys("12345678");
Thread.sleep(2000);
driver.findElement(By.id("loginbutton")).click();
String ele = driver.getTitle();
Reporter.log(ele,true);
String url = driver.getCurrentUrl();
Reporter.log(url,true);
}
}

