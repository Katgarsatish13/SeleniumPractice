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

public class DropDown12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		s.selectByIndex(2);
		s.selectByValue("10");
		s.selectByVisibleText("Sep");
		  List<WebElement> options = s.getOptions();
		  ArrayList a=new ArrayList<>();
		   System.out.println(options.size());
		   for(WebElement w:options)
		   {
			  String text = w.getText();
			  System.out.println(text);
		   }
		   Collections.sort(a);
		   for(Object o:a)
		   {
			   System.out.println(o);
		   }
		driver.close();
		
	}
}
