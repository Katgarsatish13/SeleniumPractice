package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("ext-gen10")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='24']")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
