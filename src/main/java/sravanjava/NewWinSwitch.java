package sravanjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NewWinSwitch
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

        driver.findElement(By.xpath("//a[@href='/oprs-web/home/faq.do']")).click();
        driver.findElement(By.xpath("//ul[@class='prntImpNote']//a[@href='/oprs-web/home/terms.do']")).click();

        WebElement tnc=driver.switchTo().activeElement().findElement(By.xpath("//td[contains(text(),'General Terms & Conditions')]"));

//        WebElement tnc=driver.findElement(By.xpath("//td[contains(text(),'General Terms & Conditions')]"));
        Boolean tnc_txt=tnc.getText().equalsIgnoreCase("General Terms & Conditions");
        System.out.println(tnc_txt);

//        driver.close();
    }
}