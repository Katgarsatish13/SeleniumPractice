package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement d = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(d).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();;
		
		WebElement plusbtn = driver.findElement(By.id("add"));
		a.doubleClick(plusbtn).perform();
		Thread.sleep(2000);
		driver.close();
		

}
}