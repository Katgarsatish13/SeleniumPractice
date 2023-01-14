package Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		s.selectByIndex(3);
		s.selectByValue("3");
		s.selectByVisibleText("Dec");
		
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		ArrayList a=new ArrayList<>();
		for(WebElement w:options)
		{
			System.out.println(w.getText());
		}
		System.out.println("after sorting");
		Collections.sort(a);
		for(Object o:a)
		{
		System.out.println(o);	
		}
		driver.close();
		
	}

}
