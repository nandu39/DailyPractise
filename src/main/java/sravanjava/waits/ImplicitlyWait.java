package sravanjava.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tsrtconline.in/oprs-web/");

//        Here in implicitly wait will be global so that it will wait for each element
//        to wait if it didn't load immediately immediately
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("searchBtn"));
        driver.findElement(By.name("toPlaceName"));


    }
}
