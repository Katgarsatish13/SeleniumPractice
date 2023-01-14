package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement src = driver.findElement(By.name("keyword"));
		 src.sendKeys("dress");
		List<WebElement> ele = driver.findElements(By.xpath("//a[contains(@class,'subdiv')]"));
	
		System.out.println(ele.size());
		for(WebElement b:ele)
		{
			System.out.println(b.getText());
		}
		driver.close();
	}

}
