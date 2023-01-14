package Autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement DropDown = driver.findElement(By.id("gh-cat"));
		Select sel=new Select(DropDown);
		sel.selectByIndex(3);
		sel.selectByValue("2984");
		sel.selectByVisibleText("Collectibles");
		Thread.sleep(3000);
		sel.deselectByValue("2984");
		sel.deselectByIndex(3);
		sel.deselectByVisibleText("Collectibles");
	}
}
