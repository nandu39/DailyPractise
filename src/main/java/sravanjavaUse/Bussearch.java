package sravanjavaUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Bussearch
{
    public static void main(String[] args) throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","./chromedriver.exe");

        WebDriver driver=new ChromeDriver();

            driver.get("https://www.apsrtconline.in/oprs-web/");
            driver.manage().window().maximize();
            driver.findElement(By.id("fromPlaceName")).sendKeys("Adi");
            Thread.sleep(1000);
            List<WebElement> fm_bs = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
            int fm_sz = fm_bs.size();
        System.out.println(fm_sz);

            for (int i = 0; i<fm_sz; i++)
            {

                String tx=fm_bs.get(i).getText();
                System.out.println(tx);
                if(i==4)
                {
                    fm_bs.get(i).click();
                    System.out.println("clicked");
                }
            }

    }
}
