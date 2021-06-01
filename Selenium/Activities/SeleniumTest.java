package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium");
        
        //driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/button")).click();
        driver.findElement(By.xpath("//button[contains(text(), 'Get Started')]"));
        System.out.println("Success");
        WebElement heading = driver.findElement(By.id("content"));
        System.out.println(heading.getText());
        Thread.sleep(1000);
        driver.close();
    }
}
