package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseEvents {
  @Test
  public void f() {
	  
	  WebDriver driver = new FirefoxDriver();
		driver.get("http://icicibank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Actions myaction = new Actions(driver);
	WebElement prod = driver.findElement(By.linkText("Products"));
	myaction.moveToElement(prod).perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement homeloan = driver.findElement(By.linkText("Home Loan"));
	myaction.moveToElement(homeloan).perform();
	myaction.click().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	
  }
}
