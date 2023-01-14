package Autosuggestion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement src = driver.findElement(By.xpath("(//div[text()='CAT'])[2]"));
		WebElement dest = driver.findElement(By.id("dropBox"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
		

}
}
