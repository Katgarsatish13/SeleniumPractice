package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Actitime act = new Actitime(driver);
	act.username("admin");
	Thread.sleep(2000);
	act.password("manager");
	Thread.sleep(2000);
	act.loginbuuton();
	driver.close();
}
}
