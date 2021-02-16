package nanduselenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScreenShotFacebook
{

    public static void main(String[] args) throws Exception
    {
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Util.ssutil(driver,"browserloaded");
        Thread.sleep(5000);

        driver.findElement(By.id("email")).sendKeys("nandu");
        Util.ssutil(driver,"uname");

        driver.quit();
    }

}