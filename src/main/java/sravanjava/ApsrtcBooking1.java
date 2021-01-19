package sravanjava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApsrtcBooking1
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.tsrtconline.in/oprs-web/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[class=\"user\"]")).click();
        driver.findElement(By.cssSelector("[name=\"userName\"]")).sendKeys("nandunka");
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("tsrtc@3");
        driver.findElement(By.cssSelector("[value=\"Login\"]")).click();
        Thread.sleep(2000);

//        driver.findElement(By.id("fromPlaceName")).sendKeys("Hyderabad");
        driver.findElement(By.id("fromPlaceName")).sendKeys("Hyderabad");
        Thread.sleep(500);
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.TAB);
        driver.findElement(By.id("toPlaceName")).sendKeys("Vijayawada");
        Thread.sleep(500);
        driver.findElement(By.id("toPlaceName")).sendKeys(Keys.ENTER);

        driver.findElement(By.id("txtJourneyDate")).click();
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[7]")).click();

        driver.findElement(By.cssSelector("table[class=\"ui-datepicker-calendar\"]>tbody>tr:nth-child(2)>td:nth-child(4)>a\n")).click();

        driver.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[7]")).click();
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(8000);

        driver.findElement(By.xpath("(//div[@class=\"selectBox selectBoxs\"]/span[@class=\"selectArrow\"]/span[@class=\"p1\"]/div[@class=\"arrowDownCs\"])[1]")).click();
//        driver.findElement(By.xpath("(//div[@class=\"arrowDownCs\"])[1]")).click();
//        driver.findElement(By.xpath("(//input[@name=\"NON A/C CLASS\"])[1]")).click();
//        driver.findElement(By.cssSelector("[title=\"Logout\"]")).click();

//        driver.findElement(By.xpath("//input[@id=\"SrvcSelectBtnForward0\"]")).click();
//        driver.findElement(By.id("sbkg")).click();

//        driver.close();
    }
}