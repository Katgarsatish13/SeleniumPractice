package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement DD = driver.findElement(By.id("gh-cat"));
		Select s=new Select(DD);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("267");
		Thread.sleep(2000);
		s.selectByVisibleText("Collectibles");
		Thread.sleep(300);
		driver.close();
	}

}
