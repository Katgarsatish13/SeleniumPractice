package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dd = driver.findElement(By.name("url"));
		Select s=new Select(dd);
		s.selectByIndex(5);
		Thread.sleep(3000);
	//	s.selectByValue("search-alias=beauty-intl-ship");
		//Thread.sleep(300);
		s.selectByVisibleText("Digital Music");
		Thread.sleep(3000);
		//s.deselectByValue("search-alias=beauty-intl-ship");
		//Thread.sleep(2000);
		s.deselectByIndex(5);
		Thread.sleep(2000);
		driver.close();
		
	}

}
