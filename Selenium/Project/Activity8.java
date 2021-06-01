package Project_Activities;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity8 {
	
		WebDriver driver;

	@BeforeTest
		public void beforeMethod() {
		 driver = new FirefoxDriver();
	    //Open browser
	    driver.get("https://alchemy.hguy.co/lms");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

@Test
	public void testMethod() throws InterruptedException {		
	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/contact/']")).click();
	String title= driver.getTitle();
	System.out.println("Title of the page is "+ title);
	driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Anandha Ganesh");
	driver.findElement(By.id("wpforms-8-field_1")).sendKeys("narutoganesh90@gmail.com");
	driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Testing Project");
	driver.findElement(By.id("wpforms-8-field_2")).sendKeys("Hello ,How are you");
	driver.findElement(By.id("wpforms-submit-8")).click();
	String msg = driver.findElement(By.xpath("//*[contains(text(),'Thanks')]")).getText();
	System.out.println(msg);
	
}
	
@AfterMethod
	public void afterMethod() {
	driver.close();
}
	
}
