package Annotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook {
	public WebDriver driver;

	@BeforeMethod
	public void open()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test
	public void run() throws InterruptedException
	{
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
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
