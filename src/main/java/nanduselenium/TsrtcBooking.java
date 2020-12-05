package nanduselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TsrtcBooking
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
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[7]")).click();

        driver.findElement(By.cssSelector("table[class=\"ui-datepicker-calendar\"]>tbody>tr:nth-child(2)>td:nth-child(4)>a\n")).click();

//        driver.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();
//        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[7]")).click();
        driver.findElement(By.id("searchBtn")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("BtFid")).click();
        driver.findElement(By.cssSelector("input[name=\"NON A/C CLASS\"]")).click();

        driver.findElement(By.id("BpFid")).click();

//        Approach 1
        List<WebElement> drp_vals = driver.findElements(By.cssSelector("[class=\"selectBox selectBoxs\"]>div>ul>li"));
        int dp_vl = drp_vals.size();

        for (int i=0; i<dp_vl;i++)
        {
            String txt_drp=drp_vals.get(i).getText();
            System.out.println(txt_drp);

            if (txt_drp.equalsIgnoreCase("KPHB COLONY"))
            {
                drp_vals.get(i).click();
            }
        }
//approach 1 end

//        approach 2
        driver.findElement(By.xpath("//span[text()='MIYAPUR']")).click();
        System.out.println("selected boarding");

        driver.findElement(By.xpath("//span[text()='KPHB COLONY']/span")).click();
//        driver.findElement(By.xpath("(//div[@class=\"selectBox selectBoxs\"]/span[@class=\"selectArrow\"]/span[@class=\"p1\"]/div[@class=\"arrowDownCs\"])[1]")).click();


//        driver.findElement(By.xpath("(//div[@class=\"arrowDownCs\"])[1]")).click();
//        driver.findElement(By.xpath("(//input[@name=\"NON A/C CLASS\"])[1]")).click();

//        driver.findElement(By.xpath("(//div[@class=\"selectBox selectBoxs\"]/span/span/div)[1]")).click();

//        driver.findElement(By.xpath("//*[@id=\"filterByDiv\"]/div/div/div[1]/div[1]/div/span[2]/span[1]/div\n")).click();
//        Select busdrop=new Select(driver.findElement(By.id("BtFid")));
//        busdrop.selectByVisibleText("NON A/C CLASS");

//        driver.findElement(By.id("SrvcSelectBtnForward0")).click();

//        driver.findElement(By.xpath("(//input[@id=\"SrvcSelectBtnForward0\"])[1]")).click();

//        driver.findElement(By.id("sbkg")).click();

//        driver.findElement(By.cssSelector("[title=\"Logout\"]")).click();
//        driver.close();
    }
}