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

public class Activity5 {
	
		WebDriver driver;

	@BeforeTest
		public void beforeMethod() {
		 driver = new FirefoxDriver();
	    //Open browser
	    driver.get("https://alchemy.hguy.co/lms");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

@Test
	public void testMethod() {		
	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']")).click();
	String title= driver.getTitle();
	System.out.println("Title of the page is "+ title);
}
	
@AfterMethod
	public void afterMethod() {
	driver.close();
}
	
}
