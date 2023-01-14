package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosugestion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("seleni");
		List<WebElement> sugestion = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
System.out.println(sugestion.size());
		for(WebElement w:sugestion)
		{
			System.out.println(w.getText());
		}
		driver.close();
}
}