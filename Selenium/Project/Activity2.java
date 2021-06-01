package Project_Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
	
		WebDriver driver;

	@BeforeTest
		public void beforeMethod() {
		 driver = new FirefoxDriver();
	    //Open browser
	    driver.get("https://alchemy.hguy.co/lms");

	}

	@Test
	public void testMethod() {		
	// get the title

	String title= driver.getTitle();
	System.out.println("Title of the page is "+ title);
	String header = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
	System.out.println(header);
	Assert.assertEquals( header, "Learn from Industry Experts");
	System.out.println("Matches");
	 
}	
	
@AfterMethod
	public void afterMethod() {
	driver.close();
}
	
}
