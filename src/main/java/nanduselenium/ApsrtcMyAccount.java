package nanduselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ApsrtcMyAccount
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
        driver.findElement(By.cssSelector("a[title=\"My Account\"]")).click();

//        No need to click to clear data
//        driver.findElement(By.cssSelector("input[name=\"address1\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"address1\"]")).clear();
        driver.findElement(By.cssSelector("input[name=\"address1\"]")).sendKeys("Bhongir");

        driver.findElement(By.cssSelector("input[name=\"address2\"]")).clear();
        driver.findElement(By.cssSelector("input[name=\"address2\"]")).sendKeys("Maa Ooru");

        driver.findElement(By.cssSelector("input[name=\"city\"]")).clear();
        driver.findElement(By.cssSelector("input[name=\"city\"]")).sendKeys("Hyderabad");

        WebElement idtype_dd= driver.findElement(By.id("proofTypeId"));

        Select idtype=new Select(idtype_dd);
        idtype.selectByVisibleText("PAN CARD");
        Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[id=\"idNumber\"]")).sendKeys("Abcd");

        driver.findElement(By.cssSelector("input[name=\"issueAuthority\"]")).sendKeys("Admin");

        driver.findElement(By.cssSelector("input[value=\"Submit\"]")).click();

        Thread.sleep(2000);

        driver.close();
    }
}