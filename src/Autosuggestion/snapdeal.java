package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapdeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("dress");
		
		List<WebElement> autosugestion = driver.findElements(By.xpath("//li[contains(@class,'suggestionList')]"));

		System.out.println(autosugestion.size());
		for(WebElement w:autosugestion )
		{
			System.out.println(w.getText());
		}
		driver.close();
		
		
		
	}

}
