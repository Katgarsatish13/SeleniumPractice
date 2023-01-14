package Autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSkillraryapp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement ab = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]"));
		ab.click();
		
		WebElement ss = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		act.doubleClick(ss).perform();
		Thread.sleep(3000);
		
		

}
}