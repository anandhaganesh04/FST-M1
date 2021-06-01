package Project_Activities;
import java.util.List;
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

public class Activity7 {
	
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

	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
	String title= driver.getTitle();
	System.out.println("Title of the page is "+ title);
	/*
	 * driver.findElement(By.xpath("//a[@href='#login']")).click();
	 * driver.findElement(By.id("user_login")).sendKeys("root");
	 * driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	 * driver.findElement(By.id("wp-submit")).click();
	 */
	Thread.sleep(1000);
	System.out.println("Logged in successfully");
	 List<WebElement> rows = driver.findElements(By.className("ld_course_grid_price"));

     System.out.println("The Number of course is"+ rows.size());

   
	
}
	
@AfterMethod
	public void afterMethod() {
	driver.close();
}
	
}
