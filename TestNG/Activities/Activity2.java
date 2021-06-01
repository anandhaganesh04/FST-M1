package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;

@BeforeTest

	public void beforeMethod() {
	WebDriver driver = new FirefoxDriver();
  
    //Open browser
    driver.get("https://www.training-support.net/selenium/target-practice");

}

@Test

	public void testMethod() {
		
	// get the title
	String title= driver.getTitle();
	System.out.println("Title of the page is"+ title);
	Assert.assertEquals(title, "Target Practice");
}

@Test

	public void testMethod2() {
	
}
	
@AfterTest

	public void afterMethod() {
	driver.close();
	
}


}
