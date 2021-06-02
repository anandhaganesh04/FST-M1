package Activities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Activityproject7_2 {
    WebDriver driver;
    
    @BeforeMethod
    public void open_browser() {
    driver= new FirefoxDriver();
    driver.get("http://alchemy.hguy.co/crm"); 
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
     @Test
      public void test1() throws InterruptedException {
          
          WebElement username = driver.findElement(By.id("user_name"));
          WebElement password = driver.findElement(By.id("username_password"));
            username.sendKeys("admin");
            password.sendKeys("pa$$w0rd");            
            System.out.println("Entered credentials");
            driver.findElement(By.id("bigbutton")).click();
            Thread.sleep(3000);
          
          WebElement sales = driver.findElement(By.id("grouptab_0"));
          sales.click();
          
          WebElement Leads = driver.findElement(By.id("moduleTab_9_Leads"));
          Leads.click();
          
        Thread.sleep(4000);
           
            List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td"));
            
            //Get rows
           List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody/tr"));
        Thread.sleep(2000);
            //Number of columns
        
            System.out.println("Number of columns are: " + cols.size());
        
            //Number of rows
        
            System.out.println("Number of rows are: " + rows.size());
            Thread.sleep(500);
            
            WebElement additionaldetails = driver.findElement(By.xpath("//table[contains(@class,'list view table-responsive')]/tbody//tr[2]//td[10]"));
            additionaldetails.click();
            
            /*WebElement additionaldetails = driver.findElement(By.cssSelector("#adspan_218434a9-eeae-6b4b-1518-5fe045e83b3f > span:nth-child(1)")); */
            /* driver.findElement(By.xpath("(//span[@title='Additional Details'])[2]")).click();*/
          
            WebElement phone_num= driver.findElement(By.xpath("//span[@class='phone']"));
            System.out.println("phone num is " + phone_num.getText());
            
    }
               
        @AfterMethod
        public void close_browser() throws InterruptedException {
            Thread.sleep(5000);
            driver.close();
        }
    }
      