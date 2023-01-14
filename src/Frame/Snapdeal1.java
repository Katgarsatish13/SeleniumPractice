package Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.snapdeal.com/");
		WebElement ele = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("close-pop")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("satish");
		Thread.sleep(3000);
		driver.close();
	}
	

}
