package nanduselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcSignup
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Softwares\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.apsrtconline.in/oprs-web/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[class=\"user\"]")).click();

        driver.findElement(By.xpath("//*[@href=\"/oprs-web/user/add.do\"]")).click();
        //driver.findElement(By.cssSelector("a[href=\"/oprs-web/login/show.do\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name=\"loginName\"]")).sendKeys("nandunka");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name=\"fullName\"]")).sendKeys("Nandakishore");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("am.nandu.k@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[name=\"mobileNo\"]")).sendKeys("9703993988");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[value=\"Submit\"]")).click();
        Thread.sleep(1000);

        driver.close();
    }
}