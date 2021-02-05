package sravanjava.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageLoadtime
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        WebDriver.Timeouts time= driver.manage().timeouts();
        time.pageLoadTimeout(3, TimeUnit.SECONDS);

        driver.manage().timeouts().setScriptTimeout(4,TimeUnit.SECONDS);

        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//        Here in implicitly wait will be global so that it will wait for each element
//        to wait if it didn't load immidetly
        driver.findElement(By.id("Somename"));
        driver.findElement(By.name("somename"));

    }
}
