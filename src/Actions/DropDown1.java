package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dd = driver.findElement(By.name("addresstype"));
		Select s=new Select(dd);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByVisibleText("Testing\r\n" + 
				"                          ");
		Thread.sleep(2000);
	}
}
