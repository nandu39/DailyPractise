package sravanjava.hashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.List;

public class HashMapPrac
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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

        driver.findElement(By.cssSelector("table[class=\"ui-datepicker-calendar\"]>tbody>tr:nth-child(4)>td:nth-child(7)>a\n")).click();

//        driver.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[7]")).click();

        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(8000);

        HashMap<String, String > hm=new HashMap() ;
//        hm.put("shiv","boss");
//        hm.put("nan","class");
//        System.out.println(hm.get("shiv"));

        List<WebElement> bus = driver.findElements(By.xpath("//div[@class='srvceNO']"));
        List<WebElement> price= driver.findElements(By.xpath("//span[@class='TickRate rupeeIco']"));

        for(int i=0;i<bus.size();i++)
        {
            String bs=bus.get(i).getText();
            String pr=price.get(i).getText();

            hm.put(bs,pr);
//            System.out.println(bs +" "+ pr);
        }
        System.out.println(hm);
        System.out.println(hm.get("1143"));

        driver.close();
    }
}
