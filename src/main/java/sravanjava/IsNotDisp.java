package sravanjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsNotDisp
{
    public boolean cancelTkt() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        WebDriver driver = new ChromeDriver();

            driver.get("https://www.tsrtconline.in/oprs-web/");
        String title = driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getAttribute("title");
        System.out.println(title);

        driver.findElement(By.cssSelector("a[class=\"user\"]")).click();
            driver.findElement(By.cssSelector("[name=\"userName\"]")).sendKeys("nandunka");
            driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("tsrtc@3");
            driver.findElement(By.cssSelector("[value=\"Login\"]")).click();
            Thread.sleep(2000);

            try
            {
                Boolean ck = driver.findElement(By.xpath("//a[@title='Cancel Tickets']")).isDisplayed();
                System.out.println(ck);
            }
            catch (Exception e)
            {

            }
            finally {
                driver.close();
            }
        return false;
    }

}
