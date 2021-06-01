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

public class Activity3 {
	
		WebDriver driver;

	@BeforeTest
		public void beforeMethod() {
		 driver = new FirefoxDriver();
	    //Open browser
	    driver.get("https://alchemy.hguy.co/lms");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Test
	public void testMethod() {		
	
	String header = driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']")).getText();
	System.out.println(header);
	Assert.assertEquals( header, "Actionable Training");
	System.out.println("Matches");
	 
}
	
@AfterMethod
	public void afterMethod() {
	driver.close();
}
	
}
