package Activities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activity7_1 {
	WebDriver driver;
	
	@BeforeMethod
	public void open_Browser() {
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://alchemy.hguy.co/crm");
	}
	
	@Test
	public void Leads_i() throws InterruptedException {
		    driver.findElement(By.className("form-control")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
			
			driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
			driver.findElement(By.xpath("//a[@href='?action=ajaxui#ajaxUILoc=index.php%3Fmodule%3DLeads%26action%3Dindex%26parentTab%3DSales']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("(//span[@title='Additional Details'])[2]")).click();
			WebElement phone_num= driver.findElement(By.xpath("//span[@class='phone']"));
			System.out.println("phone num is " + phone_num.getText());
			
	}
			
	@AfterMethod
	public void close_browser() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}