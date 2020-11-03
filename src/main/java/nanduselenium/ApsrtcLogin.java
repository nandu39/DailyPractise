package nanduselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcLogin
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.apsrtconline.in/oprs-web/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[class=\"user\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name=\"userName\"]")).sendKeys("nandunka");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("apsrtc@3");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[value=\"Login\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[title=\"Logout\"]")).click();

        driver.close();
    }
}