package sravanjava.alerts;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1
{

    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tsrtconline.in/oprs-web/");
        driver.findElement(By.xpath("//input[@name='searchBtn']")).click();

        Thread.sleep(1000);
        Alert alt=driver.switchTo().alert();
        String alt_msg=alt.getText();
        System.out.println("Alert Msg is: "+alt_msg);
        alt.accept();

        String exp_msg="Please select start place..";
        Assert.assertEquals(alt_msg,exp_msg);

//        driver.quit();
    }

}
