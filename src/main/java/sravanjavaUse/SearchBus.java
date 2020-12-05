package sravanjavaUse;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class SearchBus
{
    public static void main(String[] args) throws InterruptedException {

//Logger creation
        Logger logger= Logger.getLogger("SearchBus");

//setting path & initializing chrome driver
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//invoking portal
        driver.get("https://www.apsrtconline.in/oprs-web/");
        logger.info("invoking portal");

//identifying elements & performing actions
        driver.findElement(By.cssSelector("input[id=\"fromPlaceName\"]")).sendKeys("Hyderabad");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[id=\"fromPlaceName\"]")).sendKeys(Keys.TAB);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[id=\"toPlaceName\"]")).sendKeys("Warangal");
        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[id=\"toPlaceName\"]")).sendKeys(Keys.TAB);
        Thread.sleep(500);
        logger.info("entered from and to places");
//selecting departure date
        WebElement element=driver.findElement(By.cssSelector("input[id=\"txtJourneyDate\"]"));
        logger.info("identified element for departure date");
//        element.clear();
//        Thread.sleep(500);
        element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"02/11/2020");
        Thread.sleep(500);
        logger.info("entered departure date");
//        driver.findElement(By.cssSelector("input[id=\"txtJourneyDate\"]")).sendKeys("02/11/2020");
//        Thread.sleep(500);
        driver.findElement(By.cssSelector("input[id=\"searchBtn\"]")).click();
        logger.info("performed search");
//holding browser view before quit
        Thread.sleep(2000);
        WebElement element1=driver.findElement(By.cssSelector("div[class=\"filterby clearfix\"]>p[class=\"filertitle\"]"));
        String validation=element1.getText();
        System.out.println("Captured value is: "+validation);
        Boolean test=validation.equalsIgnoreCase("Filter by");
        System.out.println("Test result is: "+test);
        logger.info("completed validation");
        Thread.sleep(2000);
//closing current browser
//        driver.quit();
    }
}
