package sravanjava.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();

        WebDriverWait wait=new WebDriverWait(driver, 30);
        WebElement ele= (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()='WebDriver']")));
//        driver.manage().timeouts().
//        WebElement ele=driver.findElement(By.xpath("//p[text()='WebDriver']"));
        Boolean sts=ele.isDisplayed();

        if(sts)
        {
            System.out.println("Element is displayed");
        }
        else
        {
            System.out.println("Element is not displayed");
        }

    }
}
