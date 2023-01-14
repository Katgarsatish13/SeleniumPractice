package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKey {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchbox = driver.findElement(By.name("q"));
		Thread.sleep(3000);
		Point loc = searchbox.getLocation();
		int x=loc.getX();
	    int y=loc.getY();
	    System.out.print(x +"x coordinate" );
	    System.out.println(y + "y coordinate");
	    driver.close();
		
		
	}

}
