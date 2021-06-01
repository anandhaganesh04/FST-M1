package Project_Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	
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
	System.out.println("Title of the page is"+ title);
	Assert.assertEquals( title, "Alchemy LMS – An LMS Application");
	System.out.println("Matches");
}	
	
@AfterMethod
	public void afterMethod() {
	driver.close();
}
	
}
