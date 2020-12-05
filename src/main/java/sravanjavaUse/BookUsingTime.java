package sravanjavaUse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BookUsingTime
{
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        to launch page
        driver.get("https://www.tsrtconline.in/oprs-web/");
        driver.manage().window().maximize();
//        to login
        driver.findElement(By.cssSelector("a[class=\"user\"]")).click();
        driver.findElement(By.cssSelector("[name=\"userName\"]")).sendKeys("nandunka");
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("tsrtc@3");
        driver.findElement(By.cssSelector("[value=\"Login\"]")).click();
        Thread.sleep(2000);
        System.out.println("login success");
//        bus search
        driver.findElement(By.id("fromPlaceName")).sendKeys("Hyderabad");
        Thread.sleep(500);
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.TAB);
        driver.findElement(By.id("toPlaceName")).sendKeys("Vijayawada");
        Thread.sleep(500);
        driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
        List<WebElement> date=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/thead/following-sibling::tbody/tr/td"));
        int dt=date.size();
        System.out.println(dt);

//      Iterate date and select one
        int i;
        for (i=0; i<=dt; i++)
        {
            if(i==12)
            {
               date.get(i).click();
            }
        }
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(6000);

//      Selecting 6am bus and getting duration of journey
       String s=driver.findElement(By.xpath("(//span[contains(text(),'06:00')]//following-sibling::p)[1]")).getText();
        System.out.println(s);

        driver.close();
    }
}
