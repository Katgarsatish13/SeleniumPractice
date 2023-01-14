package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement health = driver.findElement(By.xpath("(//a[text()='Health & Beauty'])[1]"));
		
Actions a=new Actions(driver);
a.moveToElement(health).perform();
driver.findElement(By.xpath("(//a[text()='Sell on eBay'])[3]")).click();
Thread.sleep(3000);
driver.close();
}
}