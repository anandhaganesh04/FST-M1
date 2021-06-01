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

public class Activity9 {
	
		WebDriver driver;

	@BeforeTest
		public void beforeMethod() {
		 driver = new FirefoxDriver();
	    //Open browser
	    driver.get("https://alchemy.hguy.co/lms​");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

@Test
	public void testMethod() throws InterruptedException {	
	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/my-account/']")).click();
	String title= driver.getTitle();
	System.out.println("Title of the page is "+ title);
	driver.findElement(By.xpath("//a[@href='#login']")).click();
	driver.findElement(By.id("user_login")).sendKeys("root");
	driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	driver.findElement(By.id("wp-submit")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/all-courses/']")).click();
	driver.findElement(By.xpath("//img[@src='https://alchemy.hguy.co/lms/wp-content/uploads/2016/12/course-3-free-img-400x223.jpg']")).click();
	System.out.println("course selected");
	Thread.sleep(5000);
	//driver.findElement(By.linkText("Analyze Content & Develop Writing Strategies")).click();
	driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/lms/lessons/analyze-content-develop-writing-strategies/']")).click();
	String coursetitle = driver.getTitle();
	System.out.println(coursetitle);
	Boolean True = driver.findElement(By.xpath("//input[@Class='learndash_mark_complete_button' and @type='submit']")).isDisplayed();
	System.out.println("Element Selectes is "+True);
	driver.findElement(By.xpath("//input[@Class='learndash_mark_complete_button' and @type='submit']")).click();
	
}
	
@AfterMethod
	public void afterMethod() {
	driver.close();
}
	
}
