package PopUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SillraryChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Thread.sleep(2000);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		//driver.quit();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		driver.findElement(By.id("myText")).sendKeys("satish");
		Thread.sleep(2000);
		driver.close();
		
	}

}
